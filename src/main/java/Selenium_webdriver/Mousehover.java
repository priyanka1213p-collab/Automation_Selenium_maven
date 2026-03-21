package Selenium_webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/slider/");
	

    //Instantiate Action Class        
    Actions actions = new Actions(driver);
    
    //Retrieve WebElemnt 'slider' to perform mouse hover 
	WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span"));
	//Move mouse to x offset 50 i.e. in horizontal direction
	actions.moveToElement(slider,50,0).perform();
	slider.click();
	System.out.println("Moved slider in horizontal directions");
	
}
}

