package com.cyient.base;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cyient.utilities.ScreenShot;




public class WebDriverWrapper {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
	
		String browser="pp";
		
		if(browser.equalsIgnoreCase("cc")) {
		
			System.setProperty("webdriver.ie.driver", "src/test/resources/driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		
		}
		
		else if(browser.equalsIgnoreCase("ff")) {
		
			System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else {
		
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		{
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.westside.com/collections/home");
	
		}
}
	
	@AfterMethod()
	public void teardown() throws Exception 
	{
		ScreenShot screenshot = new ScreenShot(driver); 
		screenshot.takesnapshot("screenpic");
		driver.quit();
	}
}
