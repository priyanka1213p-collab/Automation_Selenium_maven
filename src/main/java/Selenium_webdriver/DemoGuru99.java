package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru99 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Radio button using a for loop
		for (int i = 1; i <= 3; i++) {
		    WebElement radio = driver.findElement(By.id("vfb-7-" + i));
		    Thread.sleep(2000);
		    radio.click();   // select radio
		    System.out.println("radio button:"+radio.isSelected());
		     
		    Thread.sleep(1000); // optional (just to see change)
		}
		
		
		//Checkbox using a for loop
		for (int i = 0; i <= 2; i++) {
		    WebElement checkbox = driver.findElement(By.id("vfb-6-" + i));
		    Thread.sleep(2000);
		    checkbox.click();   // select checkbox
		    System.out.println("checkbox:"+checkbox.isSelected());
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   
		}
		 driver.close();
		
		
		
			
		}
		
		
		
		
		}
			
	
		
	


