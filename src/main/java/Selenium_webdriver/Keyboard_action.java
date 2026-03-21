package Selenium_webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action {
public static void main(String[] args) {
	
	//webdriver is used to connect with browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement username = driver.findElement(By.name("email"));
	Actions Builder = new Actions (driver);
	Actions action = (Actions) Builder.moveToElement(username).click().keyDown(username,Keys.SHIFT)
			.sendKeys(username,"hello")
			.keyUp(username,Keys.SHIFT)
			.doubleClick(username)
			.contextClick()
			.build();
	      action.perform();
			
	
}

}
