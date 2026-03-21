package Junit_programs;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class parameter_check {
	Numcheck numcheck;
	@Parameterized.Parameter
	public int num;
	//provide input data
	@Parameterized.Parameters
	public static Object[] data() {
		return new Object[] {2,3,4,5,6};
	}
	@Before
	public void setup() {
		numcheck=new Numcheck();
		
	}
	
	@Test
	public void testEven() {
		
		boolean result=numcheck.isEven(num);
		System.out.println("even num"+num+ result);
		if(num%2==0) {
			assert(result);
		}
		else {
			assert(!result);
		}
	}
	@Ignore
	@Test
	public void testodd() {
		
		boolean result=numcheck.isodd(num);
		System.out.println("odd num"+num+""+result);
		if(num%2!=0) {
			assert(result);
		}
		else {
			assert(!result);
		}
	}



}