package Appl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_xl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
String path = "C:\\Users\\Rita\\Desktop\\Velocity.xlsx";
	
	FileInputStream file=new FileInputStream(path);	
	
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
	System.out.println(data);
	
   }

}
//Sheet sheet=book.getSheet("Sheet1");//name of the sheet
//int lastRow=sheet.getLastRowNum();
//Row row=sheet.getRow(row num)
//int Lastcell=sheet.getLastCellNum(); 
//Cell cell=sheet.getCell(cell num)
//String text=cell.getStringCellValue();
//double value=cell.getNumericcellValue();
//Date date=cell.getDateCellValue();