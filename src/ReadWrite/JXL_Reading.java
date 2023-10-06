package ReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXL_Reading {

	public static void main(String[] args) throws IOException, BiffException  {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\VISHNU\\Desktop\\selworkbook\\jxl1");
		
		Workbook book=Workbook.getWorkbook(fis);
		
		Sheet s=book.getSheet("write");
		
		String data= s.getCell(0, 0).getContents();
		System.out.println(data);
		
		String data1= s.getCell(0, 1).getContents();
		System.out.println(data1);
		
		Sheet s1=book.getSheet(1);
		
		String d= s1.getCell(0, 1).getContents();
		System.out.println(d);
		
		String d1= s.getCell(1, 4).getContents();
		System.out.println(d1);
		
		
		
		
	}

}
