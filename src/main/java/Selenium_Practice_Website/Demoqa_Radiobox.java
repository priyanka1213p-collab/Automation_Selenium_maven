package Selenium_Practice_Website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Radiobox {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/radio-button");
	
	WebElement yesbtn = driver.findElement(By.xpath("//label[text()='Yes']"));
	yesbtn.click();
	System.out.println("Selected successfully");
	
	WebElement Impressivebtn = driver.findElement(By.xpath("//label[text()='Impressive']"));
	Impressivebtn.click();
    System.out.println("Impressivebtn selected successfully");
    
//    JavascriptExecutor js = (JavascriptExecutor) driver;
// // Scroll down by pixels
// js.executeScript("window.scrollBy(0,500)");
    
    //JavascriptExecutor js = (javascriptExecutor) driver;
    //js.executeScript("window.scrollBy(0,500)");
    
		
//	WebElement radiobtn1 = driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
//	radiobtn1.click();
//	System.out.println("RadioButton" +radiobtn1.isSelected());
//	
//	WebElement radiobtn= driver.findElement(By.xpath("//*[@id=\"impressiveRadio\"]"));	
//	radiobtn.click();
//	System.out.println("ImpressiveRadiobutton" +radiobtn.isSelected());
//	
//	WebElement radiobtn2 = driver.findElement(By.xpath("//*[@id=\"noRadio\"]"));
//	radiobtn2.click();
//	System.out.println("No button " +radiobtn.isSelected());
//	
//	// Find all radio buttons
//    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));

//    // For loop
//    for(int i = 0; i < radios.size(); i++) {
//
//        WebElement radio = radios.get(i);
//
//        // check if radio button is enabled
//        if(radio.isEnabled()) {
//
//            radio.click();
//            System.out.println("Clicked Radio Button: " + radio.getAttribute("id"));
//            System.out.println("Selected Status: " + radio.isSelected());
//
//            Thread.sleep(2000);
//        }
//    }

    driver.quit();
}
}


