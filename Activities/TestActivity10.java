package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity10 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/drag-drop");
        // Print the title of the page
        System.out.println(driver.getTitle());

        // Find the football
        WebElement football = driver.findElement(By.id("ball"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.dragAndDrop(football,dropzone1).build().perform();
        
        //Verify that ball has entered zone2
        System.out.println(dropzone1.findElement(By.className("dropzone-text")).getText());
        //Once verified move to zone 2
        builder.clickAndHold(football).moveToElement(dropzone2).release().build().perform();
        //Verify the ball had entered zone 2
        System.out.println(dropzone2.getText());
        // Close the browser
        driver.quit();
    }
}

