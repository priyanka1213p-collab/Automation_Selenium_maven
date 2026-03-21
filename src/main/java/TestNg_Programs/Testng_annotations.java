package TestNg_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_annotations {
@BeforeClass	
public void Beforeclass() {
	System.out.println("Before class");
	
}
@BeforeMethod
public void Beforemehod() {
	System.out.println("Before method ");
}


@Test(priority = 2)
public void secondTest() {
	System.out.println("SECOND test to run");
}
@Test(priority = 1)
public void firstTest() {
	System.out.println("FIRST test to run");
}
@Test(priority = 3)
public void ThirdTest() {
	System.out.println("THIRD test to run");
}
@AfterClass
public void Afterclass() {
	System.out.println("After class");
}

@AfterMethod 
public void Aftermethod() {
	System.out.println("After method ");
}

}
