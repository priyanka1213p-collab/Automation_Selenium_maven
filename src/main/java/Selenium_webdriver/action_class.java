package Selenium_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_class {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.manage().window().maximize();
	
	// customer id 
	WebElement cid = driver.findElement(By.name("cusid"));
	cid.sendKeys("1234");
	Thread.sleep(3000);
	
	//Reset Button
	WebElement reset = driver.findElement(By.name("res"));
	reset.click();
	Thread.sleep(3000);
		
	//submit button 
	WebElement btn = driver.findElement(By.name("submit"));
	btn.click();
	Thread.sleep(3000);
	
	//Alert Message Display
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(3000);
	
	//After delete a alert message 
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(3000);
	
	driver.quit();	
	
	
	
	
	
}

}
