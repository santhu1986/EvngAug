package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AloginSD
{

	WebDriver driver;

@Given("^User Should on Ranford Home Page$")
public void user_Should_on_Ranford_Home_Page() throws Throwable
{
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://192.168.1.4/ranford2");
    Thread.sleep(3000);
	
}

@When("^User Should enters \"(.*)\" and \"(.*)\"$")
public void user_Should_enters_UserName_and_Password(String un,String Pwd) throws Throwable 
{
	   driver.findElement(By.id("txtuId")).sendKeys(un);
	   driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	  
}

@Then("^User validates Admin Login$")
public void user_validates_Admin_Login() throws Throwable 
{
	String Expval="Welcome to Admin";
	   
	 String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   
	   //Comaprision
	   
	   if (Expval.equalsIgnoreCase(Actval))
	   {
		System.out.println("Admin Login Succ");
	   }
	   else
	   {
		   System.out.println("Admin Login Failed");
	   }
}


}
