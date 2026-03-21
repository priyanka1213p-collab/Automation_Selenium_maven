package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_copy_paste {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	
	//locate element
	WebElement currentadd=driver.findElement(By.id("currentAddress"));
	WebElement peradd=driver.findElement(By.id("permanentAddress"));
	currentadd.sendKeys("Tops technologies vadodara");
	
	
	//create Actions object
	Actions action=new Actions(driver);
	
	//Ctrl+A
	action.click(currentadd)
	.keyDown(Keys.CONTROL)
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.perform();
	
	//ctrl +c
	action.keyDown(Keys.CONTROL)
	.sendKeys("c")
	.keyUp(Keys.CONTROL)
	.perform();
	
	//clcik second textbox
	action.click(peradd).perform();
	
	//ctrl+v
	action.keyDown(Keys.CONTROL)
	.sendKeys("v")
	.keyUp(Keys.CONTROL)
	.perform();
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
	
	


