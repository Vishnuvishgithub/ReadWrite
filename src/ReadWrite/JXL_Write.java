package ReadWrite;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
// Creating a workbook through code
public class JXL_Write {
	public static  void main(String[] args) throws IOException, RowsExceededException, WriteException  {
		
	WritableWorkbook book=Workbook.createWorkbook(new File("C:\\Users\\VISHNU\\Desktop\\selworkbook\\jxl1.xls"));
		
		WritableSheet sheet=book.createSheet("write",0);
		Label value1 = new Label(0,0,"Welcome");
		Label value2=new Label(0 , 1 , "JXL");
		
		WritableSheet sheet1=book.createSheet("write1",0);
		Label val1 = new Label(0,1,"HAI");
		Label val2=new Label( 1 , 4 , "HELLO");
		sheet.addCell(value1);
		sheet.addCell(value2);
		
		sheet1.addCell(val1);
		sheet1.addCell(val2);
		
		book.write();
		book.close();
		
		System.out.println("Workbook Created ");
		
	}

}
