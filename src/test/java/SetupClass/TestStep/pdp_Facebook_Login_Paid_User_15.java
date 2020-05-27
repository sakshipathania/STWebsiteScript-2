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

public class pdp_Facebook_Login_Paid_User_15 extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,80);
	
	@Given("^user is already on pdp page FP xv$")
	public void user_is_already_on_pdp_page_FP_xv() throws Throwable {
	    
		driver.get("https://www.slideteam.net/adm-risk-monitoring-and-management-techniques-2018.html");
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

	@Then("^User click on Download button to download the product xv$")
	public void user_click_on_Download_button_to_download_the_product_xv() throws Throwable {
		
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
	    
	}

	@Then("^user is redirected to Login page xv$")
	public void user_is_redirected_to_Login_page_xv() throws Throwable {
		Thread.sleep(4500);
	}

	@Then("^User click on sign in with facebook button xv$")
	public void user_click_on_sign_in_with_facebook_button_xv() throws Throwable {
	    try {
		 WebElement fb_login_link = driver.findElement(By.xpath("//*[@id='maincontent']/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/a"));
		 Thread.sleep(2000);
		 fb_login_link.click();
		Thread.sleep(3000);
		log.info("It's opening the website URL");
	    } catch (NoSuchElementException NP)
	    { 
	    }
		  
		try {
		 WebElement fb_email = driver.findElement(By.xpath("//*[@id='email']"));
		 Thread.sleep(2000);
		    fb_email.sendKeys("sumit.kumar@slidetech.in");
		    Thread.sleep(2000);
		} catch (NoSuchElementException NP) { }
		try {
		    WebElement fb_pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pass']")));
		    Thread.sleep(2000);
		    fb_pass.sendKeys("redhat2090");
		    Thread.sleep(2000);
		} catch (NoSuchElementException PN) { }
		try {
		    WebElement fb_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='loginbutton']")));
		    Thread.sleep(2000);
		    fb_login_btn.click();
		    Thread.sleep(2000);
		} catch (NoSuchElementException lo) { }
	}

	@Then("^user will be redirected to same page  xv$")
	public void user_will_be_redirected_to_same_page_xv() throws Throwable {
	    Thread.sleep(2000);

	}

	@Then("^user download the product xv$")
	public void user_download_the_product_xv() throws Throwable {
	   /* Thread.sleep(1000);
              
		WebElement download_btn_pdp_fp = driver.findElement(By.id("clicking"));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		driver.get("https://www.slideteam.net/");*/
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.product:nth-child(4) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#clicking")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		// logout
		Thread.sleep(2000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				Thread.sleep(1000);
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		
	
	}

	@Then("^user logout from website xv$")
	public void user_logout_from_website_xv() throws Throwable {
	   
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
		    Thread.sleep(2000);


		}
		
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	    driver.manage().deleteAllCookies();
	    Thread.sleep(7000);
	    
	}

}
