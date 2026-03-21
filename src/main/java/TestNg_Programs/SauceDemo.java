package TestNg_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemo {

WebDriver driver;
@BeforeClass
public void OpenBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	// Set browser time limits
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));

	driver.get("https://www.saucedemo.com/");
	System.out.println("Open Website");
}
	
	@Test(priority = 1 )
	public void loginModule() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login should be successfully ");
		
	}
	
	@Test(priority = 2 ,dependsOnMethods = "loginModule")
	public void productModule() throws InterruptedException {
		Thread.sleep(2000);
		//Product add
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();		
		System.out.println("Products added to the cart ");
		//Remove the 
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		System.out.println("Remove to the cart ");
		
	}
	
	@Test(priority = 3 , dependsOnMethods = "productModule" )
	public void cartModule() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		System.out.println("Cart page opened");
	}
	
	@Test(priority = 4 , dependsOnMethods = "cartModule")
	public void checkoutModule() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Priyanka");
		driver.findElement(By.id("last-name")).sendKeys("Patel");
		driver.findElement(By.id("postal-code")).sendKeys("380001");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		System.out.println("Chekout Started");
	}
	
	@Test(priority = 5)
	public void logoutModule() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		System.out.println("Logout Successfully ");
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Browser closed");
	}
	
	;
	
	


}
