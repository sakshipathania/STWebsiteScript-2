package SetupClass.TestStep;

import SetupClass.Set;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class pdp_Gmail_Logout_12 extends Set {

	@Given("^navigate to the gmail url xii$")
	public void navigate_to_the_gmail_url_xii() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(3000);
		driver.get("https://mail.google.com");
		Thread.sleep(5000);
	driver.manage().deleteAllCookies();
	Thread.sleep(8000);
	
	    
	}
}
