package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/table.html");
	
	//test table row data
	//test table column data
	
//	WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
//	System.out.println(table.getText());
	
//	WebElement table1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[3]"));
//	System.out.println(table1.getText());
	
//	WebElement tagname = driver.findElement(By.tagName("table"));
//	System.out.println(tagname.getText());
	
	WebElement rows = driver.findElement(By.xpath("/html/body/table/tbody/tr"));
	System.out.println("Total Rows:" +rows.getSize());
	
	driver.quit();
}

}
