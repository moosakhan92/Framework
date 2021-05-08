package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL){
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else{
			System.out.println("Sorry! Do not support this browser.");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appURL);
		
		return driver;
	}
	
	public static void quiteBrowser(WebDriver driver){
		driver.quit();
	}

}
