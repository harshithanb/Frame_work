package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.diver", "./software/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	 WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}}
