package com.cyient.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtils {
	
	
	public static Object[][] getsheetIntoObjectArray(String filepath, String sheetname) throws IOException {

		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(file); 
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowCount = sheet.getPhysicalNumberOfRows();

		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] main = new Object[rowCount - 1][cellCount];
		DataFormatter format = new DataFormatter();
		for (int r = 1; r < rowCount; r++)
		{
			for (int c = 0; c < cellCount; c++)
			{
				XSSFRow row = sheet.getRow(r);
				XSSFCell cell = row.getCell(c);
				String cellValue = format.formatCellValue(cell);
				main[r - 1][c] = cellValue;
			}
		}book.close();
		return main;
	}

}
