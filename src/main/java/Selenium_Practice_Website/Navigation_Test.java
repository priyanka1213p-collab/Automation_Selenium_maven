package Selenium_Practice_Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");
        System.out.println("Opened Google");

        // Open Amazon
        driver.get("https://www.amazon.in/");
        System.out.println("Opened Amazon");

        // Go Back
        driver.navigate().back();
        System.out.println("Back to Google");

        // Go Forward
        driver.navigate().forward();
        System.out.println("Forward to Amazon");

        // Refresh Page
        driver.navigate().refresh();
        System.out.println("Page Refreshed");

        // Close Browser
        driver.quit();
    }
}