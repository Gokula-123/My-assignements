package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelServiceNow {

	public static String[][] getData(String excelFileName) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./Test-data/"+excelFileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowNumber = sheet.getLastRowNum();
		System.out.println(rowNumber);
		XSSFRow header = sheet.getRow(0);
		short colNumber = header.getLastCellNum();
		System.out.println(colNumber);
		String[][] TwoDimensional = new String[rowNumber][colNumber];
		for(int i=1;i<=rowNumber;i++) {
			XSSFRow rowOrder = sheet.getRow(i);
			for(int j=0;j<colNumber;j++) {
				XSSFCell cellOrder = rowOrder.getCell(j);
				String data = cellOrder.getStringCellValue();
				TwoDimensional[i-1][j]= data;
				System.out.println(data);
			}
		}
		book.close();
		return TwoDimensional;
			}
	
}
