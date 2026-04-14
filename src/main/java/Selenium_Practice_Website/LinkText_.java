package Selenium_Practice_Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_ {
public static void main(String[] args) throws InterruptedException {
	
	
	
	//LinkText
	
	WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/link.html");

//    // Exact match
//    driver.findElement(By.linkText("Home")).click();
//	
//	driver.quit();
	
    
    List<WebElement> links = driver.findElements(By.linkText("click here"));

    for(int i = 0; i < links.size(); i++){
        links = driver.findElements(By.linkText("click here")); // re-fetch
        links.get(i).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}

}
