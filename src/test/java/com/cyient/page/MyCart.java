package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class MyCart {
		
	private WebDriver driver;
	
	public By cartLocator=By.xpath("//div[@class='cart-icon svg-mb']//a[@title='Cart Icon']//*[local-name()='svg']");
	public By cartremoveLocator	= By.xpath("//a[@class='remove']");
	public By cartErrorLocator	= By.xpath("//p[@class='alert alert-warning']");
	
	public MyCart(WebDriver driver) {
	
		this.driver=driver;
	}

	public void clickOnMyCart() {
	
		driver.findElement(cartLocator).click();
	}
	
	public void clickOnRemove() {
	
		driver.findElement(cartLocator).click();
	}
	
	public String cartErrormsg() {
	
	   String actualValue =driver.findElement(cartErrorLocator).getText();
		return actualValue;
	}
	
}
