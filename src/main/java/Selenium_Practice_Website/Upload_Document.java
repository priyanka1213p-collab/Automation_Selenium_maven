package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Document {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/upload-download");
	Thread.sleep(4000);
	//Download file 
	driver.findElement(By.id("downloadButton")).click();
	System.out.println("Downloaded successfuly");
	Thread.sleep(3000);
	//Uplaod File
	driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\hp\\Downloads\\sample-61.pdf");
	Thread.sleep(3000);
	System.out.println("File Upload Successfully");
	driver.quit();
	
	
}

}
