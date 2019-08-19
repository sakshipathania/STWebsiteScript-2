package SetupClass.TestStep;

import SetupClass.Set;
import cucumber.api.java.en.Given;

public class pdp_Facebook_Logout_10 extends Set {

	@Given("^navigate to the facebook url x$")
	public void navigate_to_the_facebook_url_x() throws Throwable {
		 
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	    driver.manage().deleteAllCookies();
	    Thread.sleep(7000);
	    
	}
	
}
