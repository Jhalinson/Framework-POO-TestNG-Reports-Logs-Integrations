package com.mystore.qa.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mystore.qa.constants.FrameworkConstants;

public class ExcelUtils {

	private static FileInputStream fIS;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	
	private ExcelUtils() {
		
	}
	public static String getCellStringData(String sheetName, int rowNum, int column) throws Exception {
		fIS = new FileInputStream(FrameworkConstants.getExcelpath());
		workbook = new XSSFWorkbook(fIS);
		sheet = workbook.getSheet(sheetName);
		String data;

		try {
			data = sheet.getRow(rowNum).getCell(column).getStringCellValue();

		} catch (Exception e) {
			data = "";
			new Throwable("The data is coming empty for cell");
		}
		workbook.close();
		fIS.close();
		return data;

	}

	public static double getCellDataInt(int row, int cell) throws Exception {
		fIS = new FileInputStream(FrameworkConstants.getExcelpath());
		workbook = new XSSFWorkbook(fIS);
		sheet = workbook.getSheet("Sheet1");
		double data = 0;
		try {
			data = sheet.getRow(row).getCell(cell).getNumericCellValue();
		} catch (Exception e) {
			new Throwable("The data is coming empty for cell");
		}

		return data;
	}


}
