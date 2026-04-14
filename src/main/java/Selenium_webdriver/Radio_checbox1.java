package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_checbox1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	//Radio Button checking 
	for(int i = 1; i<=3; i++) {
	WebElement radio = driver.findElement(By.id("vfb-7-" +i));
	radio.click();
	Thread.sleep(2000);
	System.out.println("Radio Button selected :" +radio.isSelected());
	Thread.sleep(2000);
}

	
	//checkbox is checking 
	for(int i = 0; i<=2; i++) {
		WebElement checkbox = driver.findElement(By.id("vfb-6-" +i));
				checkbox.click();
				
		System.out.println("Checkbox is selected " +checkbox.isSelected());
		
		
	}
}
}