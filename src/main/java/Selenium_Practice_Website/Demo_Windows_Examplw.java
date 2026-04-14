package Selenium_Practice_Website;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Windows_Examplw {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/browser-windows");
	
	// parent window
	String parent = driver.getWindowHandle();
	
	//Click New Tab 
	driver.findElement(By.id("tabButton")).click();
	Thread.sleep(3000);
	
	//Click Window button 
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(3000);
	
	//Click new window message
	driver.findElement(By.id("messageWindowButton")).click();
	Thread.sleep(3000);
	
	//Set all windows
	Set<String> allwindows = driver.getWindowHandles();
	
	
	//Child window 
	for(String cw: allwindows) {
		if(!cw.equals(parent)) {
			driver.switchTo().window(cw);
		}
	}
	System.out.println("Switched to child window");
	Thread.sleep(3000);
	
	driver.switchTo().window(parent);
	System.out.println("Switched to parent window");
	
	
}

}
