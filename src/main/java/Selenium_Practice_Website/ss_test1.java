package Selenium_Practice_Website;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss_test1 {
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	
	TakesScreenshot ts = (TakesScreenshot) driver; 
	File src = ts.getScreenshotAs(OutputType.FILE);
	Thread.sleep(3000);
	
	File destination = new File("C:\\Users\\hp\\Downloads\\dashboard.jpg ");
	FileUtils.copyFile(src, destination);
	System.out.println("Screenshot taken successfully");
}


}
