package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(2000);

        // Click to open new window
        driver.findElement(By.linkText("Click Here")).click();

        // Parent window
        String parent = driver.getWindowHandle();
        Thread.sleep(3000);

        // Set All windows
        Set<String> allwindows = driver.getWindowHandles();

        // Switch to child window
        for(String w : allwindows){
            if(!w.equals(parent)){
                driver.switchTo().window(w);
            }
        }

        System.out.println("Switched to child window");

        Thread.sleep(3000);

        // Switch back to parent
        driver.switchTo().window(parent);

        System.out.println("Back to parent window");

        driver.quit();
        
        		
        		
        	}
        
    }
    
