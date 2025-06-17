package Activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        
        driver.get("https://training-support.net/webelements/selects");
        driver.manage().window().maximize();
 
        System.out.println(driver.getTitle());
        Select dropdown = new Select(driver.findElement(By.cssSelector("select.h-10")));
        
        dropdown.selectByVisibleText("One");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        dropdown.selectByValue("three");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        System.out.println("All available option:");
        for (WebElement option: dropdown.getOptions()) {
        	System.out.println(option.getText());
        }
        

        driver.quit();
    }
}
