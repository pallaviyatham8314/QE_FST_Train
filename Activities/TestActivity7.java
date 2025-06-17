package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println(driver.getTitle());

        //Find the text field element
        WebElement textBox = driver.findElement(By.id("textInput"));
        
        System.out.println(textBox.isEnabled());//false
        //check if it is enabled
        driver.findElement(By.id("textInputButton")).click();        
        //check enabled again and print it
        System.out.println(textBox.isEnabled());//true
        
        // close the browser 
        driver.quit();
    }
}