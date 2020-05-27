package SetupClass.TestStep;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Facebook_Sign_UP_3 extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,30);


	@Given("^user is already on pdp page iii$")
	public void user_is_already_on_pdp_page_iii() throws Throwable {
		
		driver.get("https://www.slideteam.net/lego-bricks-with-different-structure-and-colours.html");
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

	@Then("^User click on Download button to download the product iii$")
	public void user_click_on_Download_button_to_download_the_product_iii() throws Throwable {
	    
		
		WebElement download_btn_pdp_fp = driver.findElement(By.xpath("//*[@id='clicking']"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		
	}

	@Then("^user is redirected to sign up page iii$")
	public void user_is_redirected_to_sign_up_page_iii() throws Throwable {
	    Thread.sleep(3000);
	}

	@Then("^User click on sign in with facebook button iii$")
	public void user_click_on_sign_in_with_facebook_button_iii() throws Throwable {
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in with Facebook')]")).click();
		
		 WebElement fb_login_btn_home_page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-block btn-social btn-facebook social-btn']")));
		 Thread.sleep(2000);
		 fb_login_btn_home_page.click();
		 
		Thread.sleep(3200);
		log.info("It's opening the website URL");
		
		 WebElement fb_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		 Thread.sleep(2000);
		    fb_email.sendKeys("slidetech.qa@gmail.com");
		    Thread.sleep(2000);
		    WebElement fb_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		    Thread.sleep(2000);
		    fb_pass.sendKeys("himanshi@123");
		    Thread.sleep(3000);
		    WebElement fb_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton")));
		    Thread.sleep(2000);
		    fb_login_btn.click();
		    Thread.sleep(2000);
	}

	@Then("^user is redirected to pricing page iii$")
	public void user_is_redirected_to_pricing_page_iii() throws Throwable {
	  Thread.sleep(1000);
	}

	@Then("^user go to free ppts page  iii$")
	public void user_go_to_free_ppts_page_iii() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^user download a free ppt  iii$")
	public void user_download_a_free_ppt_iii() throws Throwable {
	  
		WebElement download_btn_pdp_fp = driver.findElement(By.xpath("//*[@id='clicking']"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Then("^user delete the account iii$")
	public void user_delete_the_account_iii() throws Throwable {
	  

		 WebElement my_account = driver.findElement(By.xpath("//a[contains(.,'My Account')]"));
		Thread.sleep(2300);
		my_account.click();
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
				catch(NoSuchElementException NP) {
					
				}

       Thread.sleep(3000);
		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteaccount-form\"]/button[1]")));
		 continue_delete.click();
		 Thread.sleep(3000);
		 
		 driver.get("https://www.facebook.com");
			Thread.sleep(5000);
		    driver.manage().deleteAllCookies();
		    Thread.sleep(7000);
		
	}
		
	}

