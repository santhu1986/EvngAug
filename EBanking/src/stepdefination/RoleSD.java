package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{

	  WebDriver driver;
	  
@Given("^Tester Should on RHP$")
public void tester_Should_on_RHP() throws Throwable 
{
     driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://192.168.1.4/ranford2");
    Thread.sleep(3000);
	
}

@When("^Tester Enters Username and Password$")
public void tester_Enters_Username_and_Password() throws Throwable 
{
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("Admin");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	  
}

@Then("^Tester click on role button$")
public void tester_click_on_role_button() throws Throwable 
{
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
}

@When("^Tester click on new Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_click_on_new_Role_and_enters_and(String Rname, String Rtype) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(Rname);
	driver.findElement(By.id("lstRtypeN")).click();
	driver.findElement(By.id("lstRtypeN")).sendKeys(Rtype);
	driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
}

@Then("^Tester Close the Applicaton$")
public void tester_Close_the_Applicaton() throws Throwable
{
      Thread.sleep(3000);
      driver.close();
}


}
