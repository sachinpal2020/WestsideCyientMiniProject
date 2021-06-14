package com.cyient.utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {

		@DataProvider
		public Object[][] invalidCredentialExcelData() throws IOException {

		Object[][] obj = ExcelUtils.getsheetIntoObjectArray("src/test/resources/ExcelFiles/Westside.xlsx",
				"validtest");

		return obj;
		
		}
		@DataProvider
		public Object[][] operationalCredentialExcelData() throws IOException {
			
		Object[][] obj = ExcelUtils.getsheetIntoObjectArray("src/test/resources/ExcelFiles/Westside.xlsx",
					"operationValidTest");

		return obj;
		
		}

}
