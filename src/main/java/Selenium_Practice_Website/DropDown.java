package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver() ;
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
//	WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
//	Select s = new Select(dropdown);
	
	Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
	
	
	s.selectByVisibleText("Blue");
	s.selectByIndex(2);	
	s.selectByValue("1");
	
	
	System.out.println("Dropdown handled successfully");
	
	
}

}
