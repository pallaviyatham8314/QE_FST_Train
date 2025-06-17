package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get(" https://training-support.net/webelements/dynamic-controls");
        driver.manage().window().maximize();
        // Print the page title
        System.out.println(driver.getTitle());
        //Get the title of the page and print it to the console.
        WebElement checkBox= driver.findElement(By.id("checkbox"));
        //Find the checkbox on the page
        driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
        //Click the "Toggle Checkbox" button to remove the checkbox.
        wait.until(ExpectedConditions.invisibilityOf(checkBox));
        //Toggle the checkbox again.
        driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
        //Wait for it appear and then select it.
        wait.until(ExpectedConditions.visibilityOf(checkBox));
        
        checkBox.click();
        //Close the browser.
        driver.quit();
    }}
