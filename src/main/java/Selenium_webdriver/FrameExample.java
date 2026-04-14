package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll
    js.executeScript("window.scrollBy(0,500)");
	driver.get("https://demoqa.com/frames");
	
	WebElement f1 = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(f1);
	Thread.sleep(3000);
    String text = driver.findElement(By.id("sampleHeading")).getText();
    System.out.println(text);
    
    driver.switchTo().defaultContent();
    
    driver.quit();
    
    
}
}
