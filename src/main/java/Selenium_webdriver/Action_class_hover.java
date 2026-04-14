package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_class_hover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	
	WebElement link_home=driver.findElement(By.linkText("Flights"));
	Actions action=new Actions(driver);
	
	Action mouseoverHome=action.moveToElement(link_home).build();
	mouseoverHome.perform();
}
}
	