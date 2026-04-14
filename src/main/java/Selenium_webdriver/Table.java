package Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/table.html");
	
	//test table row data
	//test table column data
	//Column1 
//	List<WebElement> column1 = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[1]"));
//	for (WebElement col : column1) {
//	    System.out.println(col.getText());
//	}
//	//Row1 
//	List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
//
//	for (WebElement r1 : row) {
//	    System.out.println(r1.getText());
//	}
	 
//	//column2 
//	List<WebElement> column2 = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[2]"));
//	for(WebElement col2:column2 ) {
//		System.out.println(col2.getText());
//	}
//	//row 2 
//	List<WebElement> row2 = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
//			for (WebElement r2 : row2) {
//		    System.out.println(r2.getText());
//			}
//			
			
//		//column3
//			List<WebElement> column3 = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[3]"));
//			for(WebElement col3:column3 ) {
//				System.out.println(col3.getText());
//			}
//		//row 3 
//			List<WebElement> row3 = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
//					for (WebElement r3 : row3) {
//				    System.out.println(r3.getText());
//					}
	
	//row 4 
	List<WebElement> row4 = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
			for (WebElement r4 : row4) {
		    System.out.println(r4.getText());
			}
	
			//row 4 
			List<WebElement> row5 = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
					for (WebElement r5 : row4) {
				    System.out.println(r5.getText());
					}		
	
	//Individuals row 
//	WebElement table1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[3]"));
//	System.out.println(table1.getText());
	
//	WebElement tagname = driver.findElement(By.tagName("table"));
//	System.out.println(tagname.getText());
	
//	WebElement rows = driver.findElement(By.xpath("/html/body/table/tbody/tr"));
//	System.out.println("Total Rows:" +rows.getSize());
	
	driver.quit();
}

}
