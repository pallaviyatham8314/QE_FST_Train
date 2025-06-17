package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the correct URL
        driver.get("https://training-support.net/webelements/tables");
        driver.manage().window().maximize();

        // Get and print the title
        System.out.println(driver.getTitle());
        
        // Find number of rows (excluding header)
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());
        
        // Find number of columns
        List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(columns.size());
        
        // Get Book Name from 5th row
       System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
       
       // Click Price column header to sort
       driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
       
       // Get Book Name from 5th row after sorting
       System.out.println(driver.findElement(By.xpath("//table/thead/tr/th[5]")).getText());
        
        //open the browser
        driver.quit();
    }
}