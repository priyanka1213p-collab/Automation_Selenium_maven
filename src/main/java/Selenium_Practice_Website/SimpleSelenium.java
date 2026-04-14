package Selenium_Practice_Website;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelenium {
	public static void main(String[] args) {
		
	// Launch browser
    ChromeDriver driver = new ChromeDriver();

    // Open website
    driver.get("https://example.com");

    // Print title
    System.out.println(driver.getTitle());

    // Close browser
    driver.quit();
}
}


