package selenium3plus;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.testng.annotations.Test;

public class Test5 {

	@Test

	public void test()
	
	{
		File file= new File("Book1.xlsx");
		
		try
		{
			
		InputStream is=new FileInputStream(file);
		
		
		XSSFWorkbook xssf=new XSSFWorkbook(is);
		
		XSSFSheet sheet1=xssf.getSheet("Sheet1");  
		
		System.
		
		
			
			
			
		}
		
		
		
		
		
	}
	
	









}
