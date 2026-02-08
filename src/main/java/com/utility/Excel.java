package com.utility;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String getParticularRowData(int rowValue, int columnValue){
		String data = null;
		try {
		File file = new File ("C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx");
		Workbook book = new XSSFWorkbook(file);//upcasting
		Sheet sheet = book.getSheet("Sheet1");
		Row row =sheet.getRow(rowValue);
		Cell cell = row.getCell(columnValue);
        DataFormatter dataFormat = new DataFormatter();
		data = dataFormat.formatCellValue(cell);
		}
				catch (Exception e) {
				e.printStackTrace();
		}
				return data;
	}
	public static void main (String[] args) {
		String result = getParticularRowData (2,2);
		System.out.println(result);
}
}

	