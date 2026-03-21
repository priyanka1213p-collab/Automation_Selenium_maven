package Junit_programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver {
WebDriver  driver;
@Before
public void setup() {
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
}

@Test
public void Test_logic() {
	String title=driver.getTitle();
	if(title.equals("Google12")) {
		System.out.println("verified with assign name");
	}
	else {
		System.out.println("not as expected title");
	}
}


@After
public void tearDown() {
	driver.quit();
	
}


}
