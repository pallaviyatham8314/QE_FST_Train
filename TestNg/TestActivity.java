package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity {
	//webDriver declaration
	WebDriver driver;
	//webDriverwait declaration
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//Initialize driver
		driver = new FirefoxDriver();
		//Initialize wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//open the page
		driver.get("https://training-support.net");
	}
	@Test(priority = 1)
	public void verifyPageTitle(){
		assertEquals(driver.getTitle(),"Training Support");
	}
		
	@Test(priority = 2)
		public void aboutPageTitle(){
			assertEquals(driver.getTitle(),"About Us");	
		
	}
	
	@AfterClass
	public void teamDown() {
		//close the browser
		driver.quit();
	}
	
}

