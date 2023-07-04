package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Pom1  extends Basepage {
	@FindBy(id="email")
	private WebElement unfield;
	@FindBy(id="pass")
	private WebElement pwdfield;
	@FindBy(name="login")
	private WebElement loginfield;
	public Pom1(WebDriver driver) {
		super(driver);
		
	}
	public void passun(String un)
	{
		unfield.sendKeys(un);
	}
	public void passpwd(String pw)
	{
		pwdfield.sendKeys(pw);
	}
	public void btn()
	{
		loginfield.click();
	}
}	
	
	
	
		



