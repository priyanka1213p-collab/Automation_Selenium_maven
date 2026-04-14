package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidtest {
	public static void main(String[] args) {
		
		   ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");

	        // Enter invalid credentials
	        driver.findElement(By.id("user-name")).sendKeys("wrong_user");
	        driver.findElement(By.id("password")).sendKeys("wrong_pass");

	        // Click login
	        driver.findElement(By.id("login-button")).click();

	        // Validate error message
	        String error = driver.findElement(By.xpath("//h3")).getText();

	        if(error.contains("do not match")){
	            System.out.println("Error message displayed correctly");
	        }

	        driver.quit();
		
	}

}
