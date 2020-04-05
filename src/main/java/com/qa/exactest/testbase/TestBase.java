package com.qa.exactest.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.exactest.util.Util;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		prop = new Properties();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/tony/ExactestBDDTestFrameWork/ExactestFrameWorkArId/src/main/java/com/qa/exactest/Properties/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * 		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("incognito");
		//options.setHeadless(true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.setProperty("webdriver.chrome.driver", "/Users/tony/FreeCrmWS/FreeCrmArId/src/chromedriver-2");
		driver = new ChromeDriver(options);
		driver.get("file:///Users/tony/websites/Exactest/exactest.ie/index.html");
		
		driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")).click();

	 */
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			System.setProperty("webdriver.chrome.driver", "/Users/tony/ExactestBDDTestFrameWork/ExactestFrameWorkArId/drivers/chromedriver-2");
			driver = new ChromeDriver(options);
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/tony/ExactestBDDTestFrameWork/ExactestFrameWorkArId/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("launchUrl"));
		
	}
	
	
	
	
	
	
}
