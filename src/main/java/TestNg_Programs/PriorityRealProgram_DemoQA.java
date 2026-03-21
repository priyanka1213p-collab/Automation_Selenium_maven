package TestNg_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PriorityRealProgram_DemoQA {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(groups="smoke")
    public void login() throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        System.out.println("Login Successful");
    }

    @Test(groups="regression", dependsOnMethods="login")
    public void addProduct() throws InterruptedException {
          Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        System.out.println("Product Added to Cart");
    }

    @Test(groups="regression", dependsOnMethods="addProduct")
    public void logout() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();

        System.out.println("Logout Process");
    }

    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}