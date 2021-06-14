package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class FilterPage {

	private WebDriver driver;

	public By filterLocator = By.xpath("//span[@class='slide-toggle_icon']");
	public By size13to14YLocator = By.xpath("//span[normalize-space()='13-14 Y']");
	public By cancleFilterLocator = By.xpath("//a[@id='close_side']//*[local-name()='svg']");

	public FilterPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickFilter() {

		driver.findElement(filterLocator).click();
	}

	public void size13to14Y() {

		driver.findElement(size13to14YLocator).click();
	}

	public void cancleFilter() {

		driver.findElement(cancleFilterLocator).click();
	}

}
