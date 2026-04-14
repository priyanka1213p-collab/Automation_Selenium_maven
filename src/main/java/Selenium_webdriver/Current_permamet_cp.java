package Selenium_webdriver;

import java.awt.RenderingHints.Key;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Current_permamet_cp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	
	WebElement curradd = driver.findElement(By.id("currentAddress"));
	curradd.sendKeys("Baroda Gujarat");
	WebElement parradd = driver.findElement(By.id("permanentAddress"));
	
	Actions act = new Actions (driver);
	Thread.sleep(3000);
	
	act.click(curradd).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	act.click(parradd).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	Thread.sleep(3000);
	driver.quit();
	
}

}
