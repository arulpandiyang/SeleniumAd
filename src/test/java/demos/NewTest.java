package demos;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {
	static WebDriver driver;
	String Expectedresult = "Find a Flight: Mercury Tours:";
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//*[@name='login']")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 120);
	  wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
	 // driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  Assert.assertEquals(Expectedresult, driver.getTitle());
	  System.out.println("Page Title is :"+driver.getTitle());
	  
	  WebElement itinery= driver.findElement(By.xpath("//*[@href='mercuryitinerary.php?osCsid=9483a93f9710af2f78879bdd10894012']"));
	  Actions act = new Actions(driver);
	  
	  //act.clickAndHold(itinery).build().perform();
	  act.clickAndHold(itinery).build().perform();
	 
	  
	  
	  
  }
  @BeforeClass
  public static void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demoaut.com/");
	  
	  System.out.println("This is my before method class");
  }

  @AfterClass
  public static void afterClass() {
	 // driver.close();
	  System.out.println("this is after class method clss "); 
  }

}
