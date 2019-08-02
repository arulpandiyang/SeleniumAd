package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pg_LoginPageFactory {
	
	WebDriver driver;
	
	public Pg_LoginPageFactory(WebDriver driver) {
		this.driver = driver;		
	}
	
	@FindBy(how=How.NAME, using="userName")
	WebElement userName;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	@FindBy(how=How.NAME, using="login")
	WebElement login;
	
	public void fLoginPage(String strUserName, String strPassWord) {
		userName.sendKeys(strUserName);
		password.sendKeys(strPassWord);
		login.click();
		
	}

}
