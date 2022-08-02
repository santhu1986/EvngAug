package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
  
	
	Library LB=new Library();
	
  @BeforeTest
  public void beforeTest() 
  {
    LB.AdminLgn("Admin","Mq$ystems@");  
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
  LB.Alogout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  LB.OpenApp("http://122.175.8.158/ranford2");
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException 
  {
  LB.Aclose();
  }

}
