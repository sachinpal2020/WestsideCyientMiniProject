package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {
	private WebDriver driver;
	
	private By searchboxLocator = By.xpath("//input[@id='boost-pfs-search-box-1']");
	private By canclecookiesLocator = By.xpath("//a[@class='notification-cookies accept_cookies_link']");
	private By selectCurrentProductLocator = By.xpath("//div[@id='product-6560812924981']//a[@class='product-grid-image']");
	private By clickSignInkLocator = By.xpath("//a[normalize-space()='Sign In']");
	
	public DashboardPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	
	public void cancleCookies()
	{
		driver.findElement(canclecookiesLocator).click();
	}
	
	public void searchBox(String itemName)
	{
		driver.findElement(searchboxLocator).sendKeys(itemName);
	}
	
	public void clickOnSearch()
	{
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();	
	}
	
	public void selectCurrentProduct()
	{
		driver.findElement(selectCurrentProductLocator).click();
	}

	public void clickOnSignIn() {
	      driver.findElement(clickSignInkLocator).click();
		}
	
}
