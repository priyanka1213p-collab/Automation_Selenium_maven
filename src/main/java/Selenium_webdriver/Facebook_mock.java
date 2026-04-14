package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_mock {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	WebElement email = driver.findElement(By.name("email"));
	act.click(email).keyDown(Keys.SHIFT).sendKeys("Hello priyanka").perform();
	act.contextClick().perform();
	act.doubleClick().perform();
	
}

}
