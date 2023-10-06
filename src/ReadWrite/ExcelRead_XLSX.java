package ReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_XLSX {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs= new FileInputStream("C:\\Excelsheet\\Testing.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(2).getCell(0));
		System.out.println(sheet.getRow(3).getCell(0));
		
     workbook.close();
	}

}
