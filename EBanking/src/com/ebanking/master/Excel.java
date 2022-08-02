package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException
	{
	     
		//Instance Class
		
		Library Lb=new Library();
		
		Lb.OpenApp("http://122.175.8.158/ranford2");
	    Lb.AdminLgn("Admin","Mq$ystems@");

	    //To Get Excel File 
	    
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
	    	
	    	String Res=Lb.Role(Rname,Rtyp);
	    	System.out.println(Res);
	    
	    	WC2.setCellValue(Res);
	    }
	    
	    //Results
	    
	    FileOutputStream FOS=new FileOutputStream("D:\\Evngjuly\\EBanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
	    WB.write(FOS);
	    WB.close();
	    
	    
	  }

}
