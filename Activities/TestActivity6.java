package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println(driver.getTitle());

        // checkbox input element
        WebElement checkBox = driver.findElement(By.id("checkbox"));
        System.out.println(checkBox.isSelected());//false
        //click checkbox
        checkBox.click();        
        //click if it is selected
        System.out.println(checkBox.isSelected());//true
        // close the browser 
        driver.quit();
    }
}