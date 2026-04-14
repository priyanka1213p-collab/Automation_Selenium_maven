package Selenium_Practice_Website;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Div_Button {
    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/checkbox");

//         Find all div elements
//        List<WebElement> divs = driver.findElements(By.tagName("div"));
//
//        System.out.println("Total divs: " + divs.size());
//
//        for (WebElement div : divs) {
//            System.out.println("Text: " + div.getText());
//            System.out.println("------------------");
//        }
    	
    	WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.tagName("button")).click();

        // Find all buttons
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("Total buttons: " + buttons.size());

        for (WebElement btn : buttons) {
            System.out.println("Button Text: " + btn.getText());
        }


        driver.quit();
    }
}
