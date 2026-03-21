package TestNg_Programs;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Palindrome_string {

		public boolean isPalindrome(String str) {
			
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				
				rev=rev+str.charAt(i);
			}
			return str.equals(rev);
			
		}
		@Test
		public void testPalindrome() {
			Assert.assertTrue(isPalindrome("afa"));
		}
		

}
