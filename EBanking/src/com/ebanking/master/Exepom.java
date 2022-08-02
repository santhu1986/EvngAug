package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
	
     @BeforeTest
	 public void pom() throws InterruptedException 
	 {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://122.175.8.158/ranford2");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.Login();
	 }
     @Test()
     public void Role() throws InterruptedException, IOException 
     {
    	  FileInputStream FIS=new FileInputStream("D:\\Evngjuly\\EBanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
 	     
  	    //Work Book
  	    
  	    XSSFWorkbook WB=new XSSFWorkbook(FIS);
  	    
  	    //Sheet
  	    
  	    XSSFSheet WS=WB.getSheet("Rdata");
  	    
  	    //Row Count
  	    
  	    int Rcount=WS.getLastRowNum();
  	    System.out.println(Rcount);
  	    
  	    //Multiple Iterations ---- Loop
  	    
  	    for (int i=1;i<=Rcount;i++)
  	    {
  		
  	    	//Row
  	    	
  	    	XSSFRow WR=WS.getRow(i);
  	    	
  	    	//Cell
  	    	
  	    	XSSFCell WC=WR.getCell(0);
  	    	XSSFCell WC1=WR.getCell(1);
  	    	
  	    	XSSFCell WC2=WR.createCell(2);
  	    	
  	    	//Cell Values
  	    	
  	    	String Rname=WC.getStringCellValue();
  	    	String Rtyp=WC1.getStringCellValue();
  	    
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Rol();
	
	RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
	RD.NewRole();
	
	RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
	RC.Rcre(Rname,Rtyp);
	
	Thread.sleep(3000);
	//Alert
	
	driver.switchTo().alert().accept();
	
	//Home
	Thread.sleep(3000);
	RD.RoleHome();
  	    }
     }

     @DataProvider
     public Object[][] Rdata()
     {
     	Object[][] Obj=new Object[3][2];
     	
     	Obj[0][0]="Cashierbnk";
     	Obj[0][1]="E";
     	
     	Obj[1][0]="Managerhj";
     	Obj[1][1]="E";
     	
     	Obj[2][0]="Gmanagerhi";
     	Obj[2][1]="E";
     	
     	return Obj;
      }
     

     
}
     //Thread.sleep(3000);
	//Branch
	
	//AHP.Br();
	
	