package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseClass {
	

	@Test(priority=1)
	public void loginApp(){
				
		logger = report.createTest("Login to Northex");
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Application Started");
		
		loginpage.loginToApp(excel.getStringData("sheet1", 0, 0), excel.getStringData("sheet1", 0, 1));
		
		logger.pass("Login Success");
	}
	
	@Test(priority=2)
	public void loginApp1(){
				
		logger = report.createTest("Logout to Northex");
		
		logger.fail("Logout Failed");
	}

}
