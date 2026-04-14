package Selenium_Practice_Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement table = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));

	    js.executeScript("arguments[0].scrollIntoView(true);", table);

	    Thread.sleep(2000);
	    // Get total pages
	    List<WebElement> pages = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));

	    int totalPages = pages.size();

	    System.out.println("Total Pages: " + totalPages);
	    // Loop through all pages
	    for (int i = 1; i <= totalPages; i++) {

	        // Re-locate pages (avoid stale element)
	        pages = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));

	        // Click page number
	        pages.get(i - 1).click();

	        Thread.sleep(2000);

	        System.out.println("===== Page " + i + " =====");
	   
	     // Get table rows
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

	        // Print each row
	        for (WebElement row : rows) {
	            List<WebElement> cols = row.findElements(By.tagName("td"));

	            for (WebElement col : cols) {
	                System.out.print(col.getText() + " | ");
	            }
	            System.out.println();
	        }
	    }

	    driver.quit();
		
	}
	

}
