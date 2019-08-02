package demos;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchroTest {
	
	static WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void f() throws InterruptedException {
	  wait = new WebDriverWait(driver, 30);
	  WebElement eInput = driver.findElement(By.xpath("//*[@id='myInput']"));
	  WebElement eFindelement = driver.findElement(By.xpath("//input[@value='FIND DETAILS']"));
//	  WebElement eHandbag = driver.findElement(By.xpath("//div[contains(text(), 'Hand bag')]"));
	 // WebElement eGoogleInput = driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @title='Search']"));
	  //eInput.sendKeys("bags");
	  
	  wait.until(ExpectedConditions.visibilityOf(eInput));
	 // System.out.println("eInput");
	  
	  Actions oAct = new Actions(driver);
	 // eInput.sendKeys("bag");
	 // oAct.moveToElement(eInput).sendKeys("bag").build().perform();
	  oAct.keyDown(eInput, Keys.SHIFT).build().perform();
	  oAct.sendKeys("b").pause(2000).sendKeys("a").pause(2000).sendKeys("g").pause(2000).build().perform();
	 oAct.moveToElement(driver.findElement(By.xpath("//div[contains(text(), 'Hand bag')]"))).click().build().perform();
	 oAct.moveToElement(eFindelement).click().build().perform();
	// oAct.
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Hand bag')]")));
	 String sText = driver.findElement(By.xpath("//*[contains(text(), 'Hand bag')]")).getText();
	 Assert.assertEquals("hand bag", sText);
	 
	
	  
	  
	  
  }
  @BeforeClass
  public static void beforeClass() {
	  String URL = "http://10.232.237.143:443/TestMeApp";
	  String gURL = "https://www.google.com/";
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
