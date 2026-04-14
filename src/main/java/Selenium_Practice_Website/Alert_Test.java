package Selenium_Practice_Website;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Test {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(3000);
	Alert A1 = driver.switchTo().alert();
	System.out.println("Simple Text :" +A1.getText());
	A1.accept();
	A1.dismiss();
	driver.quit();
	
	
	
}

}



