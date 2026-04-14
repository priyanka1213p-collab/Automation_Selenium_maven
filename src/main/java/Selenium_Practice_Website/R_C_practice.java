package Selenium_Practice_Website;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_C_practice {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Radio checking 
		for(int i = 1; i<=3; i++ ) {
			WebElement radio = driver.findElement(By.id("vfb-7-" + i));
			radio.click();
			System.out.println("Radio button check" +radio.isSelected());
			
			System.out.println();
		}
			System.out.println();
			//checkbox checking
			for(int i = 0; i<=2; i++) {
				WebElement checkbox = driver.findElement(By.id("vfb-6-" +i));
				checkbox.click();
				System.out.println("checkbox check" +checkbox.isSelected());
				
				
			}
		}
	

}
