package TestNg_Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

//Priority check 
public class TestNg_Practice {
//@Test(priority = 3)
//public void loginTest() {
//	System.out.println("Login Test 1 ");
//}
//
//@Test(priority = 1)
//public void dashboard() {
//	System.out.println("Dashboard Test ");
//}
//
//@Test(priority = 2)
//public void logout() {
//	System.out.println("Logout Test");
//}
	
//Alphabetical Order check 
//@Test	
//public void bTest()
//{
//	System.out.println("B Test ");
//}
//@Test
//public void aTest() {
//	System.out.println("A test");
//}
	
	
//Dependency program 
@Test
public void login() {
	System.out.println("Login Successfully ");
}
@Test(dependsOnMethods = "login")
public void dashboard() {
	System.out.println("Dashbpard opened");
}
@Test(dependsOnMethods = "dashboard")
public void logout() {
	System.out.println("Logout successfully ");
}

}