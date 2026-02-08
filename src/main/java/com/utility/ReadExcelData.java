package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void getParticularRowData() { 
		//String data = null;
		
		try {
			
		File file= new File("C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx");
		
		Workbook book = new XSSFWorkbook(file); //UPCASTING
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(8);
		
		Cell cell = row.getCell(0);
		
		String data1 = cell.getStringCellValue();
		System.out.println(data1);
		
		//Formatting every cell to String
		//DataFormatter dataFormat = new DataFormatter();
		
		//data1 = dataFormat.formatCellValue(cell);
		
	}catch (Exception e)
		{e.printStackTrace();
		}
		//return data;
		
		
	}

public static void main (String[]args) {
	getParticularRowData();
}
}
	
	//public static void getAllData() {
	//try {
		//File file = new File("C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx");
		//Workbook book = new XSSFWorkbook(file);
		//Sheet sheet = book.getSheet("Sheet1");
		
		//int lastRowCount = sheet.getLastRowNum();
		//System.out.println("No of Rows: "+lastRowCount);
		
		//short lastCellCount = sheet.getRow(0).getLastCellNum();
		//System.out.println("No of Columns: "+lastCellCount);
		
		//for (int i=0;i<=lastRowCount;i++) {
		//Row row = sheet.getRow(i);
		
		//for (int j=0;j<=lastCellCount;j++) {
		//Cell cell = row.getCell(j);
		
		//Formatting
		//DataFormatter dataFormat = new DataFormatter();
		//String data = dataFormat.formatCellValue(cell);
		//System.out.println(data);
		//}
		//}	
	//}catch (Exception e) {
		//e.printStackTrace();
	//}
//}
	//public static void writeData() {
		//try {
		//File file = new File("C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx");
		
		//FileInputStream fileInput = new FileInputStream(file);
		
		//Workbook book = new XSSFWorkbook(fileInput);
		
		//book.getSheet("IPTFEB").createRow(1).createCell(0).setCellValue("Raju");
		
		//FileOutputStream fileOutput = new FileOutputStream(file);
		
        //book.write(fileOutput);
        
        //System.out.println("====Successfully created====");

        //} catch (Exception e) {
          //  e.printStackTrace();
        //}
    //}
	//public static void main(String [] args) {
		//writeData();
		
	//}
	 
//}



