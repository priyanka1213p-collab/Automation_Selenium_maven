package Junit_programs;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;

public class TestExecutionFlow {
	
	@BeforeClass
	public static void BeforeClassMethod() {
		System.out.println("BeforeClass - Execute once before all class methods ");
		
	}
	@Before
	public void beforeMethod() {
		System.out.println("Before - Execute before each test");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Excute Test 1 ");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Excute test case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Excute test case3");
	}
	
	@After
	public void afterClass() {
		System.out.println("After - Execute a after each test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After - excute a after method ");
	}

}
