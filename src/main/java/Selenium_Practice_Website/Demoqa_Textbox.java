package Selenium_Practice_Website;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Textbox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	
	//Maximize browser
	//driver.manage().window().maximize();
	
	//Verify title
	String title = driver.getTitle();
	System.out.println("Page title is:" +title);
	
	//Full name field
	WebElement fullname = driver.findElement(By.id("userName"));
	fullname.sendKeys("Priyanka Patel");
	Thread.sleep(2000);
	
	//Clear Field
	 driver.findElement(By.id("userName")).clear();
		Thread.sleep(2000);

	 //Special Character
		driver.findElement(By.id("userName")).sendKeys("%$%34");
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("Dhruvil Patel");
		
	//Email Textfield
	driver.findElement(By.id("userEmail")).sendKeys("Priyanka1213.p@gmail.com");
	driver.findElement(By.id("userEmail")).clear();
	Thread.sleep(2000);
	
	driver.findElement(By.id("userEmail")).sendKeys("priyanka.com");
	Thread.sleep(3000);
	driver.findElement(By.id("userEmail")).clear();
	
	Thread.sleep(2000);
	driver.findElement(By.id("userEmail")).sendKeys("priyanka234@gmail.com");
	Thread.sleep(2000);
	
	//Current Address/PA/Submit
	driver.findElement(By.id("currentAddress")).sendKeys("House 23, Street 5, Alkapuri Area, Vadodara, Gujarat, India 390007");
	driver.findElement(By.id("permanentAddress")).sendKeys("B180 sayaji township vadodara");
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	
//	String output = driver.findElement(By.id("output")).getText();
//
//    System.out.println("Submitted Data:");
//    System.out.println(output);
	



    // Close browser
    driver.quit();

	
	//Output data
	
	
	
}
}
