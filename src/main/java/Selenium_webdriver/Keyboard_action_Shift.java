package Selenium_webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action_Shift {
public static void main(String[] args) {
	
	//webdriver is used to connect with browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement username = driver.findElement(By.name("email"));
	// Create Actions object
    Actions a1 = new Actions(driver);

    // Perform keyboard actions
//    a1.moveToElement(username)
//           .click()
//           .keyDown(Keys.SHIFT)
//           .sendKeys("hello")
//           .keyUp(Keys.SHIFT)
////           .doubleClick()
////           .contextClick()
//           .build()
//           .perform();
    
    a1.click(username).keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform();
			
	
}

}
