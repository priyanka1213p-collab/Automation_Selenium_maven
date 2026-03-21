package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_downtest {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver  driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/eclipse-workspace/Selenium_maven_project/src/main/java/Selenium_webdriver/home.html");
	
	WebElement city = driver.findElement(By.name("city"));
	Select select = new Select(city);
	Thread.sleep(3000);
	
	select.selectByVisibleText("baroda");
	Thread.sleep(3000);
	
	select.selectByValue("surat");
	Thread.sleep(3000);
	
	select.selectByIndex(0);
	Thread.sleep(0);
	
	driver.quit();
	
}

}
