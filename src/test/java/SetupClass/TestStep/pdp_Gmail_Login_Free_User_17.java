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

public class pdp_Gmail_Login_Free_User_17 extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	@Given("^user is already on pdp page FP xvii$")
	public void user_is_already_on_pdp_page_FP_xvii() throws Throwable {
		driver.get("https://www.slideteam.net/bar-graphs-and-pie-charts-sale-business-powerpoint-templates-themes.html");
		Thread.sleep(3000);
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
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}
		Thread.sleep(1000);
	}

	@Then("^User click on Download button to download the product xvii$")
	public void user_click_on_Download_button_to_download_the_product_xvii() throws Throwable {
		
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(4000);
	    
	}

	@Then("^user is redirected to Login page xvii$")
	public void user_is_redirected_to_Login_page_xvii() throws Throwable {
	    Thread.sleep(1000);

	    
	}

	@Then("^User click on sign in with google button xvii$")
	public void user_click_on_sign_in_with_google_button_xvii() throws Throwable {
	   
		 WebElement gmail_btn = driver.findElement(By.xpath("//a[contains(text(),'Sign in with Google')]"));
		    Thread.sleep(2000);
		 gmail_btn.click();
		
		 Thread.sleep(3000);
			try
			{
				WebElement another_btn=driver.findElement(By.xpath("//div[text()='Use another account']"));
			    Thread.sleep(1000);
				another_btn.click();
				
				
			}
			catch (Exception e) {
				// TODO: handle exception
				
			
			}
		
		Thread.sleep(4000);
		WebElement gmail_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
		Thread.sleep(2000);
	    gmail_email.sendKeys("slidetech.qa@gmail.com");
	    Thread.sleep(2000);
	    WebElement next_1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#identifierNext > span:nth-child(3) > span:nth-child(1)")));
	    Thread.sleep(2000);
	    next_1.click();
	    Thread.sleep(2000);
	    WebElement gmail_pass = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".I0VJ4d > div:nth-child(1) > input:nth-child(1)")));
	    Thread.sleep(2000);
	    gmail_pass.sendKeys("Himanshi@123");
	    Thread.sleep(2000);
	    WebElement next_2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwordNext > span:nth-child(3)")));
	    Thread.sleep(2000);
	    next_2.click();
	    Thread.sleep(2000);
	}

	@Then("^user will be redirected to same page  xvii$")
	public void user_will_be_redirected_to_same_page_xvii() throws Throwable {
	    Thread.sleep(1000);

	  
	}

	@Then("^user download the product xvii$")
	public void user_download_the_product_xvii() throws Throwable {
		
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		driver.get("https://www.slideteam.net/");
	}

	@Then("^user logout from website xvii$")
	public void user_logout_from_website_xvii() throws Throwable {
		
		Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	    
		
		Thread.sleep(3000);
		driver.get("https://mail.google.com");
		Thread.sleep(5000);
	driver.manage().deleteAllCookies();
	Thread.sleep(8000);
	
	
	}
	

}
