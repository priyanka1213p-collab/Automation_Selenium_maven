package Selenium_Practice_Website;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNam_Input {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Find all input fields
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        // Count input fields
        System.out.println("Total input fields: " + inputs.size());

        // Print details of each input field
        for (WebElement input : inputs) {
            System.out.println("ID: " + input.getAttribute("id"));
            System.out.println("Type: " + input.getAttribute("type"));
            System.out.println("Value: " + input.getAttribute("value"));
            System.out.println("----------------------");
        }

        driver.quit();
        
        //list<WebElement> links = drive
    }
}
