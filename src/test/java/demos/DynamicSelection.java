package demos;


import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicSelection {
	static WebDriver driver;
  @Test
  public void fDynamic() {
	  
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebElement aboutUs = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/a/span"));
	  WebElement ourOffice = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"));
	  WebElement chennai = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li/a/span"));
	  
	  Actions oAct = new Actions(driver);
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu3']/li[3]/a/span")));
	  
	  oAct.moveToElement(aboutUs).build().perform();
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span")));
	  
	  oAct.moveToElement(ourOffice).build().perform();
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li/a/span")));
	  
	  oAct.moveToElement(chennai).click().build().perform();
	  
	  String parentwindow = driver.getWindowHandle();
	  Set<String> set= driver.getWindowHandles();
	 
	  
	 for (String s:set) {
		 driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		 By officeContact = By.xpath("//*[@id='demo3']/b/child::p");
		List<WebElement> lstOfficeContact= driver.findElements(officeContact);
		for (int i = 0; i < lstOfficeContact.size(); i++) {
			System.out.println(lstOfficeContact.get(i).getText());
			
		}
		
		 
		
	}
	  
  }
  @BeforeClass
  public static void beforeClass() {
	  String URL= "http://10.232.237.143:443/TestMeApp";
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(URL);
  }

  @AfterClass
  public static void afterClass() {
	  driver.close();
	  driver.quit();
	  
	  
  }

}
