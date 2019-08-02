package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pages.Login;
import utility.BrowserFactory;

public class LoginTest {
  static WebDriver driver;
	@Test
  public void fTest() throws IOException {
		String strBrowserName ;
		String strURL ;
		String strFilePath = "C:\\Users\\training_c2d.02.11\\Desktop\\Excel\\DemoLogin.xlsx";
		File oFile = new File(strFilePath);
		FileInputStream oFileInput = new FileInputStream(oFile);
		XSSFWorkbook oFileWB = new XSSFWorkbook(oFileInput);
		XSSFSheet oSheet = oFileWB.getSheet("demo");
		
		strBrowserName = oSheet.getRow(1).getCell(0).getStringCellValue();
		strURL = oSheet.getRow(1).getCell(1).getStringCellValue();
		
			
	 driver = BrowserFactory.startBrowser(strBrowserName,strURL );
	 Login oLogin = new Login(driver);
	 oLogin.fLogin(oSheet.getRow(1).getCell(2).getStringCellValue(), oSheet.getRow(1).getCell(3).getStringCellValue());
	  oFileWB.close();
  }
	
/*@AfterClass
public void afterClass() {
	
	driver.close();
	
	
}*/
}
