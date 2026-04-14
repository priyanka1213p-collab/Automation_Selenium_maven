package Selenium_Practice_Website;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Register {

    public static void main(String[] args) throws InterruptedException {

        // Open browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demoqa.com/automation-practice-form");

        // Fill basic details
        driver.findElement(By.id("firstName")).sendKeys("Priyanka");
        driver.findElement(By.id("lastName")).sendKeys("Patel");
        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");

        // Gender
        driver.findElement(By.xpath("//label[text()='Female']")).click();

        // Mobile
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");

        // Scroll down
        ((org.openqa.selenium.JavascriptExecutor)driver)
                .executeScript("window.scrollBy(0,500)");

        // Upload file
        driver.findElement(By.id("uploadPicture"))
              .sendKeys("C:\\Users\\hp\\Downloads\\login.png");

        // Address
        driver.findElement(By.id("currentAddress")).sendKeys("Gujarat");

        // State
        driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
        driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);

        // City
        driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
        driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);

        // Submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        // Thank you message
        String msg = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
        System.out.println("Message: " + msg);

        // Close browser
        driver.quit();
    }
}