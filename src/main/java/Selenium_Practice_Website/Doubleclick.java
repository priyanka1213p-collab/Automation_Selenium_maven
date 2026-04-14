package Selenium_Practice_Website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Doubleclick {
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		}
	
	@Test
	public void doubleclickTest() throws InterruptedException {
		//Double clic code 
//		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
//		Actions act = new Actions(driver);
//		act.doubleClick(btn).perform();
//		System.out.println("Double click done");
		
		//right click code
		//Performs right click using contextClick()
		
		WebElement btn = driver.findElement(By.id("rightClickBtn"));
		Actions act = new Actions (driver);
		act.contextClick(btn).perform();
		Thread.sleep(3000);
	}
		
		@AfterClass
	    public void teardown() {
	        driver.quit();
		}
		
		
	}


