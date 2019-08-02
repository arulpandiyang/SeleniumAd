package demos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RobotClassTest {
	WebDriver driver;
  @Test
  public void fFileUpload() throws InterruptedException, AWTException {
	  
	  Robot oRobot = new Robot();
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium 3.0\\\\chromedriver_win32(1)\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  String URL = "C:\\Users\\training_c2d.02.11\\Desktop\\inpufiletype.html";
	  driver.get(URL);
	  Thread.sleep(5000);
	  
	  By ChooseFile = By.id("1");
	  driver.findElement(ChooseFile).click();
	  Thread.sleep(2000);
	  String strFilepath = "C:\\Users\\training_c2d.02.11\\Desktop\\Excel\\Testdata.xlsx";
	  
	  StringSelection oStringSel = new StringSelection(strFilepath);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(oStringSel, null);
	  
	  oRobot.delay(2000);
	  oRobot.keyPress(KeyEvent.VK_CONTROL);
	  oRobot.keyPress(KeyEvent.VK_V);
	  
	  oRobot.setAutoDelay(2000);
	  oRobot.keyRelease(KeyEvent.VK_CONTROL);
	  oRobot.keyRelease(KeyEvent.VK_V);
	  
	  oRobot.delay(2000);
	  oRobot.keyPress(KeyEvent.VK_ENTER);
	  oRobot.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
  }
}
