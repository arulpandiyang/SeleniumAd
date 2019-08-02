package demos;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Chrome {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.11\\Desktop\\selenium Exe files\\chromedriver.exe");
      //driver= new ChromeDriver();
	  driver= Utilityclass.startBrowser("chrome");
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void Login() 
  {

	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
