package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Evngjuly\\EBanking\\src\\features\\Role.feature",
                  glue="stepdefination",monochrome=true,
                  plugin={"pretty","json:Target/Role/Roleresult.json"})
public class LoginRunner 
{

}
