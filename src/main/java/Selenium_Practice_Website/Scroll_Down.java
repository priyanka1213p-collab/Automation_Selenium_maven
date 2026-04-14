package Selenium_Practice_Website;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	
	JavascriptExecutor js = (JavascriptExecutor )driver;
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0, 1500)");
	System.out.println("Page is Scroll Dowm ");
	driver.quit();
}
}
