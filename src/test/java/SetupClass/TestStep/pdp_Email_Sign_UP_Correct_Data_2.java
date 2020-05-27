package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Sign_UP_Correct_Data_2 extends Set {

	WebDriverWait wait = new WebDriverWait(driver,50);

	@Given("^user is already on PDP Page FP ii$")
	public void user_is_already_on_PDP_Page_FP_ii() throws Throwable {
		
		driver.get("https://www.slideteam.net/technology-powerpoint-templates/private-public-cloud-computing/0115-big-data-icon-set-data-analytics-icon-set-cloud-computing-networking-funnel-ppt-slide.html");
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
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}
		Thread.sleep(1000);
	    
	}

	@Then("^User click on Download button to download the product ii$")
	public void user_click_on_Download_button_to_download_the_product_ii() throws Throwable {
		
		
		WebElement download_btn_pdp =driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp.click();
		Thread.sleep(2000);
	   
	}

	@Then("^user is redirected to sign up page ii$")
	public void user_is_redirected_to_sign_up_page_ii() throws Throwable {
	    
		// move to sign up form
		WebElement sign_up_page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,'Create an Account')])[1]")));
		Thread.sleep(2000);
		sign_up_page.click();
		Thread.sleep(2000);
		
	}

	@Then("^user enter new email and correct details to sign up ii$")
	public void user_enter_new_email_and_correct_details_to_sign_up_ii() throws Throwable {
		
		//generate new email id  to sign up
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
	    
	    String signup_email=generatedString;
	    String full_email="selenium.testing."+generatedString+"@gmail.com";
	    System.out.println(full_email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		Thread.sleep(2000);
	    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_address")));
		Thread.sleep(2000);
	    new_email_signup.sendKeys(full_email);
		Thread.sleep(2000);
	   
		
		 WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstname")));
			Thread.sleep(2000);
		    new_fname_signup.sendKeys("Selenium");
			Thread.sleep(2000);

		    WebElement new_lname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastname")));
			Thread.sleep(2000);
		    new_lname_signup.sendKeys("Testing");
			Thread.sleep(2000);
			
			 WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
				Thread.sleep(2000);
			    new_pwd_signup.sendKeys("selenium@123");
				Thread.sleep(2000);

			    WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-confirmation")));
				Thread.sleep(2000);
			    new_pwd1_signup.sendKeys("selenium@123");
				Thread.sleep(2000);
				
				WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("captcha_user_create")));
				Thread.sleep(2000);
			    new_captcha_signup.sendKeys("Aj7W2mtf9namwf55");
			    
			    WebElement new_btn_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".submit")));
				Thread.sleep(2000);
			    new_btn_signup.click();
				Thread.sleep(2000);
			   
	}

	@Then("^user is redirected to pricing page And then user navigates to free ppt page ii$")
	public void user_is_redirected_to_pricing_page_And_then_user_navigates_to_free_ppt_page_ii() throws Throwable {
	   
		// free ppt pg
		Thread.sleep(2000);
		WebElement free_ppt_btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Free PPTs')]")));
		Thread.sleep(2000);
	    free_ppt_btn.click();
		Thread.sleep(1000);
	}

	@Then("^user downloads a free product ii$")
	public void user_downloads_a_free_product_ii() throws Throwable {
	   
		driver.findElement(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
	   driver.get("https://www.slideteam.net/");
	   Thread.sleep(3000);
		
	}

	@Then("^user delete the account ii$")
	public void user_delete_the_account_ii() throws Throwable {
	   

		 driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
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



		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteaccount-form\"]/button[1]")));
		 continue_delete.click();
		 Thread.sleep(3000);
		
	}


	
}
