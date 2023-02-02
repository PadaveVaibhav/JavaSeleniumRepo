package com.swaglabs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public void loadConfig() {

		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream(
					System.getProperty(("user.dir") + "Configuration\\config.properties"));
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 @BeforeClass
	public void launchApp() {

		String browserName = prop.getProperty("browser");
		if (browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.contains("Chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
//		 Maximise the screen
		driver.manage().window().maximize();
//		  Delete all cookies
		driver.manage().deleteAllCookies();
//		  Implicit wait Timeout
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
//		  Page Load Timeouts	  
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageload ")), TimeUnit.SECONDS);
//		  Get the URL
		driver.get(prop.getProperty("url"));

	}

}
