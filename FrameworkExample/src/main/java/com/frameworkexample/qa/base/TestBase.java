package com.frameworkexample.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public Properties prop;
	public String url;

	public TestBase() {
		initialization();
		
	}

	
	public void loadProperty() {
		
		//Added comment Don
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/frameworkexample/qa/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {
		
		loadProperty();

		url = prop.getProperty("url");
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	try
	{
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Log 4j intialization");
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("Testbase done");
	}catch(Exception e)
	{
		
	}
	
	}
	public String getPropValue(String key)
	{
		if(prop!=null && prop.containsKey(key))
		{
			return prop.getProperty(key);
		}
		return null;
	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	
	
}