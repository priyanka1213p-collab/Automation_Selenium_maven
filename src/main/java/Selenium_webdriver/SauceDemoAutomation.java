package Selenium_webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAutomation {

    WebDriver driver;
public static void main(String[] args) {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@BeforeClass
	//public void openBrowser() {
     ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	System.out.println("Website open");
	//}
	
	//Login Functionality check 
	//@Test
	//public void LoginTest() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	System.out.println("Login Successfully ");
}
}

