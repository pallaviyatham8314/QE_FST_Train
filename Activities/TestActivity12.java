package Activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the correct URL
        driver.get("https://training-support.net/webelements/dynamic-content");
        driver.manage().window().maximize();

        // Get and print the title
        System.out.println(driver.getTitle());

        // Find and click the "Click me!" button
        driver.findElement(By.id("genButton")).click();

        // Wait for the dynamic content containing the word "release"
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"));

        // Print the dynamic content
        System.out.println(driver.findElement(By.id("word")).getText());

        // Close the browser
        driver.quit();
    }
}
