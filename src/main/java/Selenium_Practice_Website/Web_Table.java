package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	
//	WebElement addbtn = driver.findElement(By.id("addNewRecordButton"));
//	addbtn.click();
//	
//	WebElement firstname = driver.findElement(By.id("firstName"));
//	firstname.sendKeys("Priyanka");
//	
//	WebElement lastname = driver.findElement(By.id("lastName"));
//	lastname.sendKeys("Patel");
//	
//	WebElement Emaiid = driver.findElement(By.id("userEmail"));
//	 Emaiid.sendKeys("Priyanka1213.p@gmail.com");
//	 
//	 WebElement age = driver.findElement(By.id("age"));
//	 age.sendKeys("15");
//	 
//	 WebElement salary = driver.findElement(By.id("salary"));
//	 salary.sendKeys("30000");
//	 
//	 WebElement department = driver.findElement(By.id("department"));
//	 department.sendKeys("Information Technology");
//	 
//	 WebElement submit = driver.findElement(By.id("submit"));
//	 submit.click();
	 
	 WebElement EditRecords = driver.findElement(By.id("edit-record-1"));
	 EditRecords.click();

}

}
