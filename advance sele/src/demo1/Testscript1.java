package demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testscript1 extends Runner1 {
	@Test(dataProvider = "testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.passun(d1);
		p.passpwd(d2);
		Thread.sleep(3000);
		p.btn();
	}
	@DataProvider(name="testdata")
	public Object[][] createdata1(){
		return new Object[][] 
				{
			{"harshitha","1234"},
			{"lohith","3455"}	
			};}}
			
	
			
			
		

	
	


