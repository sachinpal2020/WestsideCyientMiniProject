package com.cyient.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
public WebDriver driver; 
	
	public ScreenShot(WebDriver driver)	{

		this.driver = driver;
	}
	
	
	public void takesnapshot(String filename) throws IOException {
		
		File file= ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file,  new File("src/test/resources/screenshotFolder/" +filename+".png"));
		
	}

}
