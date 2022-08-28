package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData2 {
	
	public static String[][] readData(String excelFileName) throws IOException {
		
		XSSFWorkbook wbook=new XSSFWorkbook("data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		
		short columnCount = sheet.getRow(0).getLastCellNum();
		
		String [][] data=new String[rowCount][columnCount];
		
		System.out.println("Total Row count is:" + rowCount);
		
		System.out.println("Total column count is:" +columnCount);
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=cell.getStringCellValue();
				
			}
			
		}
		wbook.close();
		return data;
	}

}
