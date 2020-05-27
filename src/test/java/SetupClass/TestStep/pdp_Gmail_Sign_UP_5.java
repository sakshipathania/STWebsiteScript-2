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

public class pdp_Gmail_Sign_UP_5 extends Set{
	
	WebDriverWait wait = new WebDriverWait(driver,30);

	@Given("^user is already on pdp page v$")
	public void user_is_already_on_pdp_page_v() throws Throwable {
	    
		driver.get("https://www.slideteam.net/bar-graphs-and-pie-charts-sale-business-powerpoint-templates-themes.html");
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

	@Then("^User click on Download button to download the product v$")
	public void user_click_on_Download_button_to_download_the_product_v() throws Throwable {
	    
		WebElement download_btn_pdp_fp =driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		
	}

	@Then("^user is redirected to sign up page v$")
	public void user_is_redirected_to_sign_up_page_v() throws Throwable {
	    Thread.sleep(6000);
	}

	@Then("^User click on sign in with google button v$")
	public void user_click_on_sign_in_with_google_button_v() throws Throwable {
		
		 WebElement gmail_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-block btn-social btn-google social-btn']")));
		    Thread.sleep(2000);
		 gmail_btn.click();
		
		 Thread.sleep(2000);
		try
		{
			WebElement another_btn=driver.findElement(By.xpath("//div[text()='Use another account']"));
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
	    Thread.sleep(8000);
		
	}

	@Then("^user is redirected to pricing page v$")
	public void user_is_redirected_to_pricing_page_v() throws Throwable {
	   
	}

	@Then("^user go to free ppts page v$")
	public void user_go_to_free_ppts_page_v() throws Throwable {

		//Thread.sleep(3000);
		//WebElement free_ppt_btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Free PPTs')]")));
		//Thread.sleep(2000);
	    //free_ppt_btn.click();
	    Thread.sleep(5000);
	}

	@Then("^user download a free ppt v$")
	public void user_download_a_free_ppt_v() throws Throwable {
	    
		
		driver.get("https://www.slideteam.net/prod-development-and-program-management.html");
		Thread.sleep(1000);
		
		driver.findElement(By.id("clicking")).click();
		Thread.sleep(5000);
		driver.get("https://www.slideteam.net/");
		Thread.sleep(4500);
	}

	@Then("^user delete the account v$")
	public void user_delete_the_account_v() throws Throwable {
		

		 driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
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

        Thread.sleep(3000);
		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		 Thread.sleep(1000);
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteaccount-form\"]/button[1]")));
		 continue_delete.click();
		 Thread.sleep(9000);
	
		 Thread.sleep(3000);
			driver.get("https://mail.google.com");
			Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		Thread.sleep(8000);
		driver.get("https://www.slideteam.net/");
		Thread.sleep(5000);
	}
	   

}
