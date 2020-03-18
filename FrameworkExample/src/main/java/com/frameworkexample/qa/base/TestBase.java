package com.frameworkexample.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public String getPropValue(String key)
	{
		if(prop!=null && prop.containsKey(key))
		{
			return prop.getProperty(key);
		}
		return null;
	}
	
	
}