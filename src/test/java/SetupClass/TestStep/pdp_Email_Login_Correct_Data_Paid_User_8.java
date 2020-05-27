package SetupClass.TestStep;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Login_Correct_Data_Paid_User_8 extends Set {

	WebDriverWait wait = new WebDriverWait(driver,50);
	
	@Given("^user is already on PDP Page MD viii$")
	public void user_is_already_on_PDP_Page_MD_viii() throws Throwable {
		
		driver.get("https://www.slideteam.net/puzzles-with-multiple-business-icons-flat-powerpoint-design.html");
		Thread.sleep(2000);
		  try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
				

			System.out.println("chat window does not open");
			}
		
				catch(NoSuchElementException NCP) {
					
				}
	    
	}

	@Then("^User click on Download button to download the product viii$")
	public void user_click_on_Download_button_to_download_the_product_viii() throws Throwable {
	  
		Thread.sleep(1000);
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		
	}

	@Then("^user is redirected to Login page viii$")
	public void user_is_redirected_to_Login_page_viii() throws Throwable {
	   
	}

	@Then("^user login with correct details viii$")
	public void user_login_with_correct_details_viii() throws Throwable {
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		Thread.sleep(2000);
		username.sendKeys("sakshi.pathania@slideteam.in");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		Thread.sleep(2000);
		password.sendKeys("Qwerty@1");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("send2")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

	@Then("^user will be redirected to same pdp page viii$")
	public void user_will_be_redirected_to_same_pdp_page_viii() throws Throwable {
	   
	}

	@Then("^user download the product viii$")
	public void user_download_the_product_viii() throws Throwable {
	        driver.get("https://www.slideteam.net/timeline-display-style-6-powerpoint-presentation-slides.html");
		Thread.sleep(1000);
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		
	}

	@Then("^user logout from website viii$")
	public void user_logout_from_website_viii() throws Throwable {
	  Thread.sleep(3000);
	   
	 driver.findElement(By.xpath("//a[contains(.,'Sign Out')]")).click();
	 Thread.sleep(3000);
		/*Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.cssSelector("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}*/
		
	}
}
