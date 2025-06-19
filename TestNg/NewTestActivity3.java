package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTestActivity3 {
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
		driver.get("https://training-support.net/webelements/login-form/");
	}
	@Test(priority = 1)
	public void verifyPageTitle(){
		//Assert page title
		assertEquals(driver.getTitle(),"Selenium: Login Form");
	}
		
	@Test(priority = 2)
	public void loginFailTest() {
	    // Find userName  
	    driver.findElement(By.id("username")).sendKeys("admin");
	    //Find password
	    driver.findElement(By.id("password")).sendKeys("WrongPassword");

	    // Click the login button
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    
	    //Find and print invalid message
	    String message = driver.findElement(By.id("subheading")).getText();
	    //Assertions
	    assertEquals(message,"Invalid credentials");
	}
	
	    @Test(priority = 3)
		public void loginPassTest() {
		    // Find userName  
	    	driver.findElement(By.id("username")).clear();
		    driver.findElement(By.id("username")).sendKeys("admin");
		    //Find password
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("password");

		    // Click the login button
		    driver.findElement(By.xpath("//button[text()='Submit']")).click();
		    
		    //Find and print invalid message
		    String message = driver.findElement(By.cssSelector("h1.text-emerald-500")).getText();
		    //Assertions
		    assertEquals(message,"Login Success!");  
	}
	
	@AfterClass
	public void tearDown() {
		//close the browser
		driver.quit();
	}
	
}

