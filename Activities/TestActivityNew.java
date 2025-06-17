package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivityNew {
    //private static By targetRow;

	public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        // Open the correct URL
        driver.get("https://training-support.net/webelements/sliders/");
        driver.manage().window().maximize();
        
        //Print the page title
        System.out.println(driver.getTitle());
        
        //find the initial value
        WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
        System.out.println(volumeValue.getText());
        //Find out print initial values
        WebElement slider = driver.findElement(By.id("volume"));
        //move to 25%
        builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120,0).release().build().perform();
        //print the new value
        System.out.println(volumeValue.getText());
        //move 75%
        builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120,0).release().build().perform();
        //print the new value
        System.out.println(volumeValue.getText());
        
        //Close the browser
        driver.quit();
	}
}