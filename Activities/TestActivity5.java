package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println(driver.getTitle());

        // checkbox is displayed
        WebElement checkBox = driver.findElement(By.id("checkbox"));
        System.out.println(checkBox.isDisplayed());
        
        //click remove checkbox element
        driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
        System.out.println(checkBox.isDisplayed());
        // print the result  
        driver.quit();
    }
}
