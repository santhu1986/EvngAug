package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

	
	WebDriver driver;

@Given("^User Should on Ranford Hp$")
public void user_Should_on_Ranford_Hp() throws Throwable 
{
	   driver=new ChromeDriver();
	   
	   //Maximise
	   
	   driver.manage().window().maximize();
	   
	   //URL
	   
	   driver.get("http://122.175.8.158/ranford2");
	   Thread.sleep(3000);
	   
}

@When("^User should enters \"(.*)\" and \"(.*)\" click login$")
public void user_should_enters_Username_password_and_click_login(String Un,String Pwd) throws Throwable 
{
	 driver.findElement(By.id("txtuId")).sendKeys(Un);
	   driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	  
}

@Then("^User Validates Admin Login Functionality$")
public void user_Validates_Admin_Login_Functionality() throws Throwable 
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
