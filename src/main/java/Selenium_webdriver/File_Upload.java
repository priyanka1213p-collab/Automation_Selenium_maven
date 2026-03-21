package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	
	//File Upload text
	WebElement file = driver.findElement(By.name("uploadfile_0"));
	file.sendKeys("C://Users//hp//Downloads//tops-jobfest-2026-id-card.pdf");
	Thread.sleep(3000);
	WebElement checkbox=driver.findElement(By.name("terms"));
	checkbox.click();
	Thread.sleep(3000);
	WebElement submit=driver.findElement(By.name("send"));
	submit.click();
	Thread.sleep(3000);
	driver.quit();
}
}
	
