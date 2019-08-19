package SetupClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"."},//tags= {"@2.2_PDP_Gmail_Sign_UP_5"},
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json","usage:target/usage.jsonx","junit:target/cucumber.xml"})


public class TestRun {

	@BeforeClass
	public static void beforeClass() throws Exception {
		Set.before_Class();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		Set.after_Class();
	}

}
