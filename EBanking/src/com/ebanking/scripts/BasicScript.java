package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript 
{
   public static void main(String[] args) 
   {
	   
	   //Launch Firefox
	   
	   String Expval="Ranford Bank";
	   
	   WebDriver driver=new ChromeDriver();
	   
	   //Maximise
	   
	   driver.manage().window().maximize();
	   
	   //URL
	   
	   driver.get("http://122.175.8.158/ranford2");
	   
	   String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	   
	   //Comaprision
	   
	   if (Expval.equalsIgnoreCase(Actval))
	   {
		System.out.println("Application Launch Succ");
	   }
	   else
	   {
		   System.out.println("Application Failed To Launch");
	   }
	   
	   
	   //Get Title
	   
	   String Tit=driver.getTitle(); 
	   System.out.println(Tit);
	   
	   //Admin Login
	   
	   Expval="Welcome to Admin";
	   
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	   
       Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   
	   //Comaprision
	   
	   if (Expval.equalsIgnoreCase(Actval))
	   {
		System.out.println("Admin Login Succ");
	   }
	   else
	   {
		   System.out.println("Admin Login Failed");
	   }
	   
	   
	//Branch Creation
	   
	   Expval="Sucessfully";
	   
	   driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
       driver.findElement(By.id("BtnNewBR")).click();
      
       driver.findElement(By.id("txtbName")).sendKeys("Mqsyshydjly");
	   driver.findElement(By.id("txtAdd1")).sendKeys("Ammerpet");
	   driver.findElement(By.id("txtZip")).sendKeys("12345");
       
       //DropDown
       Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
       Ctry.selectByVisibleText("INDIA");
       
       new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("Delhi");

       new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("Delhi");
       driver.findElement(By.id("btn_insert")).click();
       
       //Alert
       
       Actval=driver.switchTo().alert().getText();
       
       if (Actval.contains(Expval)) 
       {
		System.out.println("Branch Created");
	   }
       else
       {
    	   System.out.println("Branch Already Exist");
       }
       
	   
	   
	   
	   
	   //Role Creation
	   
	//Employee Creation
	   
	//Banker Login
}
}
