package demo1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Ddt_script1 {
	public static String getdata(String sh,int r,int c) {
		String value=null;
		WebDriver driver=null;
		try {
			FileInputStream fis=new FileInputStream("./Excel/hiii.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Pom1 p=new Pom1(driver);
			Sheet sheet=book.getSheet(sh);
			Row row =sheet.getRow(r);
			Cell cell=row.getCell(c);
			value =cell.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;}}
			
			
			
		
	


