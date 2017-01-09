package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException,InvalidFormatException,IOException
	{
		/*XSSFWorkbook work = new XSSFWorkbook("C:/jp/jp.xlsx");
		FileInputStream fis= new FileInputStream("C:/jp/jp.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=work.getSheet("Sheet1");
			Row row1=sheet1.getRow(0);
			System.out.println(row1.getCell(0));*/
		//Workbook wb=WorkbookFactory.create(fis);
		/*Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);*/
		File fil=new File("C:/jp/jp.xlsx");

	      FileInputStream fs=new FileInputStream(fil);

	    Workbook workbook = WorkbookFactory.create(fs);

	      Sheet sheet = workbook.getSheet("Sheet1"); 

	       Row row1=sheet.getRow(1);
	      Cell cell1 =row1.getCell(2);

	      System.out.println(cell1);
	}
 
}
