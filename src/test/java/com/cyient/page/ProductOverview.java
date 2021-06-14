package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class ProductOverview {
	
	private WebDriver driver;
	
	public By selectSizeLocator=By.xpath("//label[normalize-space()='13-14 Y']");
	public By addToCartLocator=By.xpath("//input[@id='product-add-to-cart']");
	
	public ProductOverview(WebDriver driver) {
	
		this.driver=driver;
	}
	
	public void selectSize13to14Y() {
		driver.findElement(selectSizeLocator).click();
	}

	public void addToCart() {
	
		driver.findElement(addToCartLocator).click();
	}
}
