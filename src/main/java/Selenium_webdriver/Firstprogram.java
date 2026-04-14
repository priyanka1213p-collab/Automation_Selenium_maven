 
package Selenium_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {
public static void main(String[] args) {
	
	
//launch chrome driver
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	//get title of page
	String title = driver.getTitle();
	if(title.equals("Google")) {
		System.out.println("Verified with assign name");
		
	}
	else {
		System.out.println("not as expected title");
	}
	driver.close();
	
	
	
	
}

}
