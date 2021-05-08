package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	@FindBy(name="login_identity1") WebElement uname;
	
	@FindBy(name="login_password") WebElement pass;
	
	@FindBy(name="login_user") WebElement loginButton;
	
	
	public void loginToApp(String usernameApp, String passwordApp){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginButton.click();
	}
}
