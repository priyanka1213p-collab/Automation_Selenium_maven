package TestNg_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Testv {

	  WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://leadmanagement.yuglogix.com/login.php");
	    }

	    @Test
	    public void loginTest() throws InterruptedException {

	        WebElement username = driver.findElement(By.name("login_username"));
	        username.sendKeys("admin@admin.com");

	        WebElement password = driver.findElement(By.name("login_password"));
	        password.sendKeys("admin123");

	    }

	    @AfterClass
	    public void closeBrowser() {
	        driver.quit();
	    }
}
