package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class SortByPage {
	
	private WebDriver driver;
	private By sortbyLocator = By.xpath("//span[@class='label-text']");
	private By hightolowLocator= By.xpath("//a[normalize-space()='Price, high to low']");
	
	public SortByPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSortBy() {
	
		driver.findElement(sortbyLocator).click();
	}
	
	public void HighToLow() {
	
		driver.findElement(hightolowLocator).click();
	}
}
