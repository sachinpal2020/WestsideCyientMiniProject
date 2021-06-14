package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class SignInPage {
	
 	private WebDriver driver;
 		
 	private By clickRegisterLocator = By.xpath("//a[@class='btn btncl']");
 	private By clickSendOTPLocator = By.id("otp_button_value");
 	private By errorLocator = By.xpath("//span[@class='text-danger']");
 	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnRegister() {
	  driver.findElement(clickRegisterLocator).click();
	}

	public void clickOnSendOTP() {
		  driver.findElement(clickSendOTPLocator).click();
		}
    public void printMsgOnConsole(String msg)
    {
    	System.out.println(msg);
    	
    }
    public String getErrorMessage() 
	{
		String actualText= driver.findElement(errorLocator).getText().trim();
		return actualText;
	}
}
