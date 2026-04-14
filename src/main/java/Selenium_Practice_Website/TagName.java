package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TagName {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();

	Thread.sleep(3000);

	//List<WebElement> links = driver.findElements(By.tagName("a"));
//	System.out.println("Total links: " + links.size()); // size link list 
//	
//     for(WebElement link : links){
//    	    System.out.println(link.getText()); // link name should be show 
//    	}
     
    List<WebElement> inputs = driver.findElements(By.tagName("input"));
     System.out.println("Total input fields: " + inputs.size());
     for (WebElement input : inputs) {
         System.out.println("ID: " + input.getAttribute("id"));
         System.out.println("Type: " + input.getAttribute("type"));
         System.out.println("Value: " + input.getAttribute("value"));
         System.out.println("----------------------");
     }
}

}
