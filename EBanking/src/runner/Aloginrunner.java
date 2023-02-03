package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\Evngjuly\\EBanking\\src\\features\\AdminLogin.feature",
		                    "D:\\Evngjuly\\EBanking\\src\\features\\RoleCreation.feature"},
                 glue="stepdefination",monochrome=true,
                 plugin= {"pretty","json:Target/Role/Roleresults.json"})
public class Aloginrunner 
{

}