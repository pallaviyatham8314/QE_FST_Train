package Activities;

import static org.testng.Assert.assertEquals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTestActivity2 {
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
		driver.get(" https://training-support.net/webelements/target-practice/");
	}
	@Test(priority = 1)
	public void verifyPageTitle(){
		//Assert page title
		assertEquals(driver.getTitle(),"Selenium: Target Practice");
	}
		
	@Test(priority = 2)
		public void verifyButtonText(){
		//Find button with black text
			String buttonText = driver.findElement(By.cssSelector("button.bg-slate-200")).getText();//Actual:Slate
			//Assert page title
			assertEquals(buttonText,"Black");
	}
	
	@Test(priority = 3, enabled = false)
	public void verifyHeadingText(){
		//Find button with black text
			String headingText = driver.findElement(By.tagName("h1")).getText();//Actual:Slate
			//Assert page title
			assertEquals(headingText,"Heading #1");
	}
	
	@Test(priority = 4)
	public void verifyFooterText(){
		throw new SkipException("This test will be skipped");
		//Find button with black text
		//String footerText = driver.findElement(By.cssSelector("span.text-gray-500")).getText();//Actual:Slate
				//Assert page title
				//assertTrue(footerText.contains("CKLabs"));	
			}	
		@AfterClass
		public void tearDown() {
			//close the browser
			driver.quit();
		}
			}
		
	
	


