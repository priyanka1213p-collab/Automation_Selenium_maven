package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_module {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://staging.guardiancapitalusa.com/login");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("Test123@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test@123");
		WebElement btn = driver.findElement(By.className("sign_btn"));
		btn.click();	
		
		WebElement error = driver.findElement(By.id("errorMsg"));

		System.out.println("Error Displayed: " + error.isDisplayed());
		System.out.println("Error Message: " + error.getText());
		
		driver.close();
	}

}
