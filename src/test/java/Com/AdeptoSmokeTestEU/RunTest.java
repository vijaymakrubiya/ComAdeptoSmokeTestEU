package Com.AdeptoSmokeTestEU;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = {"@signUp"},plugin = {"pretty","html:target/cucumber-reports/report"})
public class RunTest {
}
