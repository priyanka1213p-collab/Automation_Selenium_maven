package Junit_programs;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {
	
	Calculator cal;
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("Object create before testing method");
	}

	@Test
	//Addition Method
	public void Additiontest() {
		int add = cal.add(34, 23);
		assertEquals(add,57);
		assertNotEquals(add,323);
		//to check null expection
		//aseertnull(add);
		assertTrue(34>23);			
	}
	
@Test
//Substraction Method 
	public void subtest() {
		int sub = cal.sub(10, 20);
		assertEquals(sub,-10);
		assertNotEquals(sub,-30);
		
	}
		
@Test
 //Multiplication
		public void multest() {
		int mul = cal.mul(20, 5);
		assertEquals(mul,100);
		assertNotEquals(mul,-100);
		
	}

@Test
//Division 
	public void divtest() {
	int div=cal.div(10, 5);
	assertEquals(div, 2);
	assertTrue(5>0);
	
}
 //Ignore used to skip the method
   @Ignore
	@Test
	public void test() {
		//logic
		System.out.println("ignire");
	}
	
	@After
	public void tearDown() {
		System.out.println("close window");
	}
	

}
