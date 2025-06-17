package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
		driver.manage().window().maximize();

        //Get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		//Left click on the Cargo.lock button
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetFile= driver.findElement(By.xpath("//h1[text()='target']"));
		
		builder.click(cargoLock).pause(5000).click(cargoToml).build().perform();
		// Print the confirmation text 
		System.out.println(driver.findElement(By.id("result")).getText());
		//Double click on the srcFile button
		builder.doubleClick(srcFile).pause(5000).contextClick(targetFile).perform();
		
		//right click on the target button
        builder.click(driver.findElement(By.cssSelector("span.ml-3"))).pause(5000).build().perform();
        
        //print the confirmation text at the end of the sequence
        System.out.println(driver.findElement(By.id("result")).getText());

        //open the browser
		driver.quit();
	}
}
