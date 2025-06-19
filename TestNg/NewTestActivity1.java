package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTestActivity1 {
	//webDriver declaration
	WebDriver driver;
	//webDriverwait declaration
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//Initialize driver
		driver = new FirefoxDriver();
		//Initialize wait
	   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//open the page
		driver.get("https://training-support.net");
	}
	@Test(priority = 1)
	public void verifyHomePageTitle(){
		//Assert page title
		assertEquals(driver.getTitle(),"Training Support");
	}
		
	@Test(priority = 2)
		public void verifyAboutPage(){
		//Find and click about us button
			driver.findElement(By.linkText("About Us")).click();
			//wait till page
			wait.until(ExpectedConditions.titleContains("About"));
		//Assert page title
			assertEquals(driver.getTitle(),"About Training Support");
	}
	
	@AfterClass
	public void tearDown() {
		//close the browser
		driver.quit();
	}
	
}

