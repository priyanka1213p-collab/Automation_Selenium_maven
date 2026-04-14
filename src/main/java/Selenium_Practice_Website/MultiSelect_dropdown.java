package Selenium_Practice_Website;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MultiSelect_dropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 🔹 Scroll down to element
        WebElement dropdown = driver.findElement(By.id("react-select-4-input"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropdown);

        // 🔹 Click using parent container (important)
        driver.findElement(By.xpath("//div[contains(@class,'css-13cymwt-control')]")).click();

        // 🔹 Select multiple values
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Green']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Blue']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Black']"))).click();

        System.out.println("Multi-select working successfully!");

        driver.quit();
    }
}