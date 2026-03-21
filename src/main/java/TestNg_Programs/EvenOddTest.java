package TestNg_Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddTest {
	public class EvenoddTest {

		public boolean isEven(int n) {
			return n%2==0;
		}
		
		@Test
		public void testEven() {
			Assert.assertTrue(isEven(10));
		}
	}

}
