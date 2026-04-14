package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Email {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		
		 WebElement fullName = driver.findElement(By.id("userName"));
	        WebElement email = driver.findElement(By.id("userEmail"));

//	        // Enter Name
//	        fullName.sendKeys("Priyanka Patel");
//
//	        Actions action = new Actions(driver);
//
//	        // Select All + Copy
//	        action.keyDown(Keys.CONTROL)
//	              .sendKeys("a")
//	              .sendKeys("c")
//	              .keyUp(Keys.CONTROL)
//	              .perform();
//
//	        // Move to Email and Paste
//	        action.click(email)
//	              .keyDown(Keys.CONTROL)
//	              .sendKeys("v")
//	              .keyUp(Keys.CONTROL)
//	              .perform();

	        
	        fullName.sendKeys("Priyanka Patel");
	        
	        Actions act = new Actions (driver);
	        
	        //Select all +copy 
	        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
	        
	        //paste email
	        act.click(email).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	        		
	}
}
