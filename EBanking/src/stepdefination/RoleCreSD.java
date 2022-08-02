package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleCreSD 
{

	WebDriver driver;

@Given("^Tester should on Ranford Home Page$")
public void tester_should_on_Ranford_Home_Page() throws Throwable 
{
	driver=new ChromeDriver();
	   
	   //Maximise
	   
	   driver.manage().window().maximize();
	   
	   //URL
	   
	   driver.get("http://122.175.8.158/ranford2");
	   Thread.sleep(3000);
	    
}

@When("^Tester Enters un and pwd click on login$")
public void tester_Enters_un_and_pwd_click_on_login() throws Throwable
{
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("Mq$ystems@");
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	 
}

@When("^Tester click on Role button$")
public void tester_click_on_Role_button() throws Throwable 
{
     Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	
}

@Then("^Tester Click on New Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_Click_on_New_Role_and_enters_and(String Rn, String Rt) throws Throwable 
{

	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rn);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(3000);
	
	 driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
	    
	
}

@When("^Tester Click on Log Out$")
public void tester_Click_on_Log_Out() throws Throwable 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
  driver.close();
	
}


}
