package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:/C:/Users/hp/eclipse-workspace/Selenium_maven_project/src/main/java/Selenium_webdriver/show1.html");
	Thread.sleep(3000);
	
	//Test hyperlink
	driver.findElement(By.linkText("show all data")).click();
	Thread.sleep(3000);
	
	//Test partial link 
	driver.findElement(By.partialLinkText("show1")).click();
	Thread.sleep(3000);
	
	driver.quit();	
	
}

}
 