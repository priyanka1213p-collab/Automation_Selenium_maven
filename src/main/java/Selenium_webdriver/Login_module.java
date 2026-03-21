 package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_module {
	public static void main(String[] args) throws InterruptedException {
		

		//Get the URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leadmanagement.yuglogix.com/login.php");
		
		//Username  textbox 
		//Positive Username Scenario
		WebElement username = driver.findElement(By.name("login_username"));
		username.sendKeys("admin@admin.com");
		Thread.sleep(3000);
		System.out.println("Username Message:" + username.isDisplayed());
		//Password Textbox
		WebElement password = driver.findElement(By.name("login_password"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		System.out.println("Password Message" +password.isDisplayed());
		//Button code 
		WebElement signInBtn = driver.findElement(By.className("btn-login"));
		signInBtn.click();
		Thread.sleep(3000);
		System.out.println("Login Successfully message" );
		
		// Validate Dashboard Redirect (Method 1 - URL Check)
        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("pid=add_lead")) {
            System.out.println("Login Successful - Redirected to pid=add_lead");
        } else {
            System.out.println("Login Failed");
        }
		
		// Negative Usename Scenario 
//		WebElement username = driver.findElement(By.name("login_username"));
//		username.sendKeys("admin@admin.com");
//		Thread.sleep(2000);
//		
//		WebElement password = driver.findElement(By.name("login_password"));
//		password.sendKeys("Wronf123");
//		
//		WebElement error = driver.findElement(By.id("fillb"));
//		System.out.println("Error Displayed :" +error.isDisplayed());
//		System.out.println("Error Message:" +error.getText());
		
		
		
		
		driver.quit();
	}

}
