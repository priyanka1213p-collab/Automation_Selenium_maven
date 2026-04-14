package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
//public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	
	Thread.sleep(3000);
	}
	
	@Test
	public void dragdropTest() throws InterruptedException {
	WebElement source = driver.findElement(By.id("draggable")); 
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, target).perform();
	System.out.println("Drag And Drop Done ");
	
	Thread.sleep(3000);
	}
	
	@AfterClass
	public void down() {
	driver.quit();		
		
}

}
