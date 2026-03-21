package Junit_programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Junit_Webdriver1 {
	WebDriver driver;
	@Before
	public void setup() {
		 driver=new ChromeDriver();
		//open website with url
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test_logic() {
		WebElement username=driver.findElement(By.name("email"));
		
		Actions builder=new Actions(driver);
		Action action=builder.
			moveToElement(username)
			.click()
			.keyDown(username,Keys.SHIFT)
			.sendKeys(username,"hello")
			.keyUp(username,Keys.SHIFT)
			.doubleClick(username)
			.contextClick()
			.build();
		action.perform();
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
}

