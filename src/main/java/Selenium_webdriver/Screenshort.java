package Selenium_webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		
		//take Screenshort
		//take Sc reenshort and store and file
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//store file at desired location
		FileUtils.copyFile(screenshot, new File("C:\\Users\\hp\\Downloads\\image\\facebook.png"));
	}

}
