package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By userName = By.name("userName");
	By passWord = By.name("password");
	By login = By.name("login");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fLogin(String strUserName, String strPassWord) {
		
		driver.findElement(userName).sendKeys(strUserName);
		driver.findElement(passWord).sendKeys(strPassWord);
		driver.findElement(login).click();
		
	}
	

}
