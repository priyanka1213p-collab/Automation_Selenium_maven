package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionClass {
//public d main(String[] args) throws InterruptedException {
	
	WebDriver driver;
	
	// Launch browser
	@BeforeClass
	public void setup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Open SauceDemo
    driver.get("https://www.saucedemo.com/");
	}

    @Test
    public void loginTest() throws InterruptedException {
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();

    Thread.sleep(6000);
    }
    @Test
    public void producthoverTest() {
    WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
    //Action class
    Actions act= new Actions(driver);
    //Mouse hover on product
    act.moveToElement(product).perform();
    System.out.println("Mouse hovered on the products");
    }
    
    @AfterClass
    public void run() {
    driver.quit();
}

}


//main not declare 
//directly Webdriver driver;
//@BeforeClass
//public void setUp()