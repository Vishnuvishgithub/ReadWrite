package ReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Excelsheet\\Testing.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
       XSSFSheet sheet = workbook.getSheetAt(2);
		
		Row row =sheet.createRow(1);
		Cell cell= row.createCell(2);
		cell.setCellValue("Write in Excel");
		
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastrow);
		
		
		
		
		
	}

}
