package Selenium_Practice_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Checkbox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	
	WebElement checkboxhome = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[3]"));
	checkboxhome.click();
	//System.out.println("Checkbox status: " +checkboxhome.toString());
	
	WebElement expandHome = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[2]"));
	expandHome.click();
	System.out.println("Show is expand");
	
	WebElement Desktopexpand = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div/div/div[2]/span[2]"));
	Desktopexpand.click();
	Thread.sleep(2000);
	
	WebElement Documentsexpand = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div/div/div[5]/span[2]"));
	Documentsexpand.click();
	Thread.sleep(2000);
	
	WebElement Downloadsexpand = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[8]/span[2]"));
	Downloadsexpand.click();
	Thread.sleep(2000);
	
	WebElement WorkSpaceexpand = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[6]/span[2]"));
	WorkSpaceexpand.click();
	
	
	//*[@id="root"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[8]/span[2]
	
	//driver.quit();	
	
}
}
