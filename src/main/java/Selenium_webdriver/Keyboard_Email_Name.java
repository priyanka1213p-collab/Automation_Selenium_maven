package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Email_Name {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	 WebElement fullName = driver.findElement(By.id("userName"));
     WebElement email = driver.findElement(By.id("userEmail"));
   //Name Field 
     fullName.sendKeys("Shefali Patel");
     Actions action=new Actions(driver);
     action.click(fullName)
     .keyDown(Keys.CONTROL)
     .sendKeys("a")
     .keyUp(Keys.CONTROL).perform();
     Thread.sleep(2000);
     
     action.keyDown(Keys.CONTROL)
     .sendKeys("c")
     .keyUp(Keys.CONTROL).perform();
     Thread.sleep(2000);
    
     
     // Move to Email field
     action.click(email).perform();
     Thread.sleep(2000);

     // Paste (CTRL + V)
     action.keyDown(Keys.CONTROL)
           .sendKeys("v")
           .keyUp(Keys.CONTROL)
           .perform();

     Thread.sleep(2000);

     driver.quit();
     
     
}
}
