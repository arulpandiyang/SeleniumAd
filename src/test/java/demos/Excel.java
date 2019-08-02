package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Excel {
  @Test
  public void fExcel() throws IOException {
	  
	  String sFilepath = "C://Users//training_c2d.02.11//Desktop//Excel//Testdata.xlsx";
	  File oFile = new File(sFilepath);
	  FileInputStream oFileInput = new FileInputStream(oFile);
	  XSSFWorkbook oWB = new XSSFWorkbook(oFileInput);
	  XSSFSheet oSheet1 = oWB.getSheet("Login");
	  
	  System.out.println(oSheet1.getLastRowNum());
	  //oSheet1.
	 System.out.println(oSheet1.getRow(1).getLastCellNum());
	  for (int i = 0; i < oSheet1.getLastRowNum()+1; i++) {
		  
		  for (int j = 0; j < oSheet1.getRow(i).getLastCellNum(); j++) {
			  
			  System.out.println(oSheet1.getRow(i).getCell(j).getStringCellValue());
			
		}
		
	}
	  oSheet1.getRow(0).createCell(2).setCellValue("Email");
	  Random oRan = new Random();
	 
	  for (int i = 1; i < oSheet1.getLastRowNum()+1; i++) {
		  int strRan = oRan.nextInt(1000);
		  oSheet1.getRow(i).createCell(2).setCellValue("Test"+strRan+"@tst.com");
	}
	  FileOutputStream oFileOutput = new FileOutputStream(oFile);
	  oWB.write(oFileOutput);
	  
	  /*String sData0 = oSheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(sData0);
	  
	  String sData1 = oSheet1.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(sData1);*/
	  oWB.close();
	  
	  
  }
}
