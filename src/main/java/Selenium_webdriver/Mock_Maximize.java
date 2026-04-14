package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_Maximize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	//Radio Check
	for(int i = 1; i<=3; i++) {
		WebElement btn = driver.findElement(By.id("vfb-7-"+ i));
		btn.click();
		System.out.println("radio buttonn is " +btn.getText());
		Thread.sleep(3000);
		
	}
	//checkbox
	for(int i = 0; i<=2; i++) {
		WebElement btn = driver.findElement(By.id("vfb-6-" + i));
		btn.click();
		System.out.println("checkbox button is" +btn.isSelected());
		Thread.sleep(3000);
	}
	
	driver.quit();
}

}
