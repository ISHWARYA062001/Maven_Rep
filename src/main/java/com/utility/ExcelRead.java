package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) {
        String value = "";

	
		//public static String getData(int rowValue,int columnValue) {
			//String data = "";
			try {
				//File file = new File("C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx") ;
				//Workbook book = new XSSFWorkbook(file);
				//Sheet sheet =book.getSheet("Sheet1");
				FileInputStream fis = new FileInputStream(filePath);
	            Workbook workbook = new XSSFWorkbook(fis);
	            Sheet sheet = workbook.getSheet(sheetName);
	            Row row = sheet.getRow(rowNum);
	            Cell cell = row.getCell(colNum);

	            value = cell.getStringCellValue();

	            workbook.close();
	            fis.close();
				//Row row = sheet.getRow(rowValue);
				//Cell cell = row.getCell(columnValue);
				//System.out.println(data);
			} catch (Exception e) {
				e.printStackTrace();
			}return value;
			//return data;
		}
}
	
//public static void main(String[] args) {
	//getData(1,1);
//}
//}
