package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");

        // Print the page title
        System.out.println(driver.getTitle());

        // Find the 3rd and 5th headers using XPath
        System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
        // Find the purple and slate buttons
        System.out.println(driver.findElement(By.cssSelector("button.bg-purple-200")).getAttribute("class"));
        System.out.println(driver.findElement(By.cssSelector("button.bg-slate-200")).getText());

        driver.quit();
    }
}
