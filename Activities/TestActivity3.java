package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity3 {
		   public static void main(String[] args) {
			//Initialize driver
			WebDriver driver = new FirefoxDriver();
			
			//Open the browser or page
			driver.get("https://training-support.net/webelements/login-form");
			
			//Page interactions
			//Print the page title
			System.out.println(driver.getTitle());
			
			//Find the username and password files
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			//Find the success message
			String message = driver.findElement(By.xpath("//h1[contains(@class, 'text-emerald-500')]")).getText();
			System.out.println(message);
			System.out.println(message.equals("Login Success!"));
			
			//close the browser
			driver.quit();
			
		}
		}
