package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Address_Paste {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement currentadd = driver.findElement(By.id("currentAddress"));
		currentadd.sendKeys("Baroda gujarat");
		WebElement parmanetadd = driver.findElement(By.id("permanentAddress"));
		
		
		//Select the current address
		Actions act = new Actions (driver);
		act.click(currentadd).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		System.out.println("address should be " +currentadd.isDisplayed());
		//paste the same as a parmaneted address
		act.click(parmanetadd).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		System.out.println("parmanetadd address same as "+parmanetadd.isDisplayed());
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
