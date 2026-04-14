package Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Pratice {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		
		//Find a One row 
		List<WebElement> row1 = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
		for(WebElement r1 :row1) {
			System.out.println(r1.getText());
		}
		System.out.println();
	
		
		//Find a second column2 
		List<WebElement> column2 = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[2]"));
		for(WebElement c2: column2) {
			System.out.println(c2.getText());
		}
		 System.out.println("------------------------------");
		
		List<WebElement> row3 = driver.findElements(By.xpath("/html/body/table/tbody/tr[3]/td"));
		for(WebElement r3 : row3) {
			System.out.println(r3.getText());
				
		}
		
		System.out.println("--------------------------");
		
//		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[3]"));
//		System.out.println(row.getText());
		
		WebElement tagt = driver.findElement(By.tagName("table"));
		System.out.println(tagt.getText());
		
		driver.quit();
	}
	

}
