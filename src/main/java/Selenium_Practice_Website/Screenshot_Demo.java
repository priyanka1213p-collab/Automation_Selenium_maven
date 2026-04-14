package Selenium_Practice_Website;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class Screenshot_Demo {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void takescreenshotTest() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\hp\\Downloads\\login.png");
		FileUtils.copyFile(src, destination);
		System.out.println("Takes Screenshot successfully");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
}
		
//    public static void main(String[] args) throws IOException {
//
//        // Launch brow
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        // Open website
//        driver.get("https://www.saucedemo.com/");
//
//        // Take screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//        // Save screenshot
//        File destination = new File("C:\\Users\\hp\\Downloads\\login.png");
//        FileUtils.copyFile(source, destination);
//
//        System.out.println("Screenshot taken successfully!");
//
//        driver.quit();
    
