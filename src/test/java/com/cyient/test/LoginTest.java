package com.cyient.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.cyient.base.WebDriverWrapper;
import com.cyient.page.DashboardPage;
import com.cyient.page.FilterPage;
import com.cyient.page.MyCart;
import com.cyient.page.ProductOverview;
import com.cyient.page.SignInPage;
import com.cyient.page.SortByPage;
import com.cyient.utilities.DataProviderUtils;

	public class LoginTest extends WebDriverWrapper {

			
	@Test(dataProvider = "invalidCredentialExcelData", dataProviderClass = DataProviderUtils.class)
	public void inValidLogin(String expectedValue) throws InterruptedException {
		
		DashboardPage dashboard = new DashboardPage(driver);
		SignInPage Login = new SignInPage(driver);
		
		dashboard.cancleCookies();		
		dashboard.clickOnSignIn();
		Login.clickOnRegister();
		Login.clickOnSendOTP();
		String actualValue = Login.getErrorMessage();
		Assert.assertEquals( actualValue , expectedValue );
		Thread.sleep(1000);

	}

	@Test(dataProvider = "operationalCredentialExcelData", dataProviderClass = DataProviderUtils.class)
	public void operationTest(String itemName , String expectedValue) throws InterruptedException {
		
		DashboardPage dashboard = new DashboardPage(driver);
		
		SortByPage sort = new SortByPage(driver);
		FilterPage filter = new FilterPage(driver);
		ProductOverview productOverview = new ProductOverview(driver);
		MyCart myCart = new MyCart(driver);
		
		dashboard.cancleCookies();
		dashboard.searchBox(itemName);
		dashboard.clickOnSearch();
		Thread.sleep(2000);
		sort.clickOnSortBy();
		sort.HighToLow();
		Thread.sleep(1000);

		filter.clickFilter();
		Thread.sleep(1000);
		filter.size13to14Y();
		Thread.sleep(1000);
		filter.cancleFilter();

		dashboard.selectCurrentProduct();

		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		
		productOverview.selectSize13to14Y();
		Thread.sleep(1000);

		myCart.clickOnMyCart();
		myCart.clickOnRemove();

		String actualValue = myCart.cartErrormsg();
		Assert.assertEquals( actualValue , expectedValue );
		Thread.sleep(1000);

	}
}
