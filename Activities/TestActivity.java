package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity {
    //private static By targetRow;

	public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the correct URL
        driver.get("https://training-support.net/webelements/tables");
        driver.manage().window().maximize();
        
        // Find number of rows (excluding header)
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());
        
        // Find number of columns
        List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(columns.size());
        
        // Find the row with ID = 10
        driver.findElement(By.xpath("//button[contains(text(), 'Add Row')]")).click();
        
        String[] dataToAdd = {"10","Hover Car Racer", "Mathew Reilly", "0330440160", "$7.99"};
        for(int i = 0;i<dataToAdd.length;i++) {
        	By lastRowCells = By.xpath("//table/tbody/tr[last()]/td[" + (i + 1)+"]");
        	driver.findElement(lastRowCells).clear();
        	driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
        }
        //print the data
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
        //close the browser
        driver.quit();
        
}
}