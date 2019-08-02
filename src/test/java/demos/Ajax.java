package demos;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ajax {
	
	static WebDriver driver;
	WebDriverWait wait;
  @Test
  public void f() {
	  String sNumber = "9";
	  wait = new WebDriverWait(driver, 10);
	  By ContentWrapper = By.xpath("//*[@class='contentWrapper']");
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(ContentWrapper));
	  
	  By NoSelect = By.id("ctl00_ContentPlaceholder1_Label1");
	  
	  String sNoselecteddate = driver.findElement(NoSelect).getText();
	  System.out.println(sNoselecteddate);
	  By dateselection = By.linkText(sNumber);
	  By loader = By.xpath("//*[@class='raDiv']");
	  
	  driver.findElement(dateselection).click();
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	  
	  System.out.println(driver.findElement(NoSelect).getText());
	  
	  
  }
  @BeforeClass
  public static void beforeClass()  {
	  String sURL = "https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx";
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(sURL);
	  //Thread.sleep(5000);
	  
	  
  }

  @AfterClass
  public static void afterClass() {
	  driver.close();
  }

}
