package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pages.Pg_LoginPageFactory;
import utility.BrowserFactory;

public class LoginTestFactory {
	WebDriver driver;
  @Test
  public void test() throws IOException {
	  String strFilepath = "C:\\Users\\training_c2d.02.11\\Desktop\\Excel\\DemoLogin.xlsx";
	  File oFile = new File(strFilepath);
	  FileInputStream oFileInput = new FileInputStream(oFile);
	  XSSFWorkbook oWorkBook = new XSSFWorkbook(oFileInput);
	  XSSFSheet oWBSheet = oWorkBook.getSheet("demo");
	  
	  String strBrowserName = oWBSheet.getRow(1).getCell(0).getStringCellValue();
	  String strURL = oWBSheet.getRow(1).getCell(1).getStringCellValue();
	  String strUserName = oWBSheet.getRow(1).getCell(2).getStringCellValue();
	  String strPassWord = oWBSheet.getRow(1).getCell(3).getStringCellValue();
	  driver = BrowserFactory.startBrowser(strBrowserName, strURL);
	  Pg_LoginPageFactory oLoginFactory = PageFactory.initElements(driver, Pg_LoginPageFactory.class);
	  oLoginFactory.fLoginPage(strUserName, strPassWord);
  }
}
