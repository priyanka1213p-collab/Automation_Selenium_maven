package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v133.audits.model.SelectElementAccessibilityIssueDetails;

public class Locator {
public static void main(String[] args) throws InterruptedException {
	//validate facebook login by email and poassword
	WebDriver driver=new ChromeDriver();
	driver.get("file:/C:/Users/hp/eclipse-workspace/Selenium_maven_project/src/main/java/Selenium_webdriver/home.html");
	WebElement username=  driver.findElement(By.name("username"));
	username.sendKeys("Admin");
	 Thread.sleep(3000);
	 WebElement password=  driver.findElement(By.name("password"));
	 password.sendKeys("1234");
	 Thread.sleep(3000);
	 
	 //test all dropdown value
	 WebElement city= driver.findElement(By.name("city"));
	 System.out.println(city.getText());
	 
	 
	 
	 
	 //test radio button
		/*
		 * WebElement male=driver.findElement(By.name("gender")); male.click();
		 */
	 Thread.sleep(3000);
	
	 for(int i=1;i<=2;i++) {
		 WebElement gender=driver.findElement(By.id("i"+i));
		 Thread.sleep(3000);
		
		 gender.click();
		 System.out.println("radio button "+gender.getText()+" "+gender.isSelected());
	 }
	
	 for(int i=1;i<=4;i++) {
		 WebElement lan=driver.findElement(By.id("lan"+i));
		 Thread.sleep(3000);
		
		 lan.click();
		 System.out.println("check box "+lan.getText()+" "+lan.isSelected());
		 
	 }
	
	 
	//String action=button.getText();
	//System.out.println(action);
	 driver.close();

}
}

