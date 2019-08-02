package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class Utilityclass
{
	static WebDriver driver;

 
  public static WebDriver startBrowser(String browser)
  {
	if(browser.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\Desktop\\selenium Exe files");
	    driver=new ChromeDriver();
	
    }
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("WebDriver.gecko.driver","C:\\Users\\training_c2d.02.11\\Desktop\\selenium Exe files");
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("internetExplorer"))
	{
		System.setProperty("WebDriver.ie.driver","C:\\Users\\training_c2d.02.11\\Desktop\\selenium Exe files");
		driver=new InternetExplorerDriver();
	}
	else
		System.out.println("Invalid Browser");
	return driver;
  }
  
}
