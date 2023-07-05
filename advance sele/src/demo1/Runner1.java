package demo1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Runner1 {
	public WebDriver driver;
	@BeforeMethod
	public void openappln() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver =new ChromeDriver();
		//base url
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeappln(ITestResult res) throws IOException {
		if(ITestResult.FAILURE==res.getStatus()) {
			Screenshot1.getphoto(driver);
		}
		driver.close();
		
	}
	

}
