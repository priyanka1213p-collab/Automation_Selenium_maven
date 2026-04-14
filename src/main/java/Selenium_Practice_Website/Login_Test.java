package Selenium_Practice_Website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

    public static void main(String[] args) {

        // Step 1: Launch Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));      
        driver.manage().window().maximize();

        // Step 2: Open URL
        driver.get("https://www.saucedemo.com/");

        // Step 3: Locate Elements
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        // Step 4: Use WebElement Methods

        // sendKeys()
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        // isDisplayed()
        System.out.println("Login Button Displayed: " + loginBtn.isDisplayed());

        // isEnabled()
        System.out.println("Login Button Enabled: " + loginBtn.isEnabled());

        // getAttribute()
        String placeholder = username.getAttribute("placeholder");
        System.out.println("Username Placeholder: " + placeholder);

        // click()
        loginBtn.click();

        // Step 5: Validation
        String currentURL = driver.getCurrentUrl();
        if(currentURL.contains("inventory")){
            System.out.println("✅ Login Successful");
        } else {
            System.out.println("❌ Login Failed");
        }

        // Step 6: Close Browser
     
        
        //Invalid login scenario 
        

//        // Enter invalid credentials
//        driver.findElement(By.id("user-name")).sendKeys("wrong_user");
//        driver.findElement(By.id("password")).sendKeys("wrong_pass");
//
//        // Click login
//        driver.findElement(By.id("login-button")).click();
//
//        // Validate error message
//        String error = driver.findElement(By.xpath("//h3")).getText();
//
//        if(error.contains("do not match")){
//            System.out.println("Error message displayed correctly");
//        }

        driver.quit();
    }
}
