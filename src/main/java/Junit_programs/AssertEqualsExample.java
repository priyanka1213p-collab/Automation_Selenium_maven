package Junit_programs;

import org.junit.Assert;
import org.junit.Test;

public class AssertEqualsExample {
	
	@Test
	public void checkNull() {
		String name = "priya567";
		
		Assert.assertNull(name);
		
	}
	

}
