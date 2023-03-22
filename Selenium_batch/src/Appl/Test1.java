package Appl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
   String path = "C:\\Users\\Rita\\Desktop\\Velocity.xlsx";
			
   InputStream file=new FileInputStream(path);	
			
   Workbook book= WorkbookFactory.create(file);
   
      Sheet sheet=book.getSheet("Sheet1");
      
      int LastRow = sheet.getLastRowNum();
       
      for(int j=1;j<5;j++)//For row_number
      {
       Row row=sheet.getRow(j);
        for(int i=0;i<2;i++)//for cell_num
        {
    	Cell cell=row.getCell(i); 
    	System.out.print(cell);
    	System.out.print(",");
        }
        System.out.println();
     }
   }
}
