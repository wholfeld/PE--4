import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class PalindromeTest {
	
	
	private Palindrome testobj;
	
	@Before
	public void preTest()
	{
		testobj = new Palindrome(999);
	}

	@Test
	public void test1() 
	{
		assertTrue(testobj.isPalindrome("WoW"));
	}
	
	@Test
	public void test2() 
	{
		assertTrue(testobj.isPalindrome("Wow"));
	}
	
	@Test
	public void test3() 
	{
		assertTrue(testobj.isPalindrome(Integer.toString(123321)));
	}
	
	@Test
	public void test4() 
	{
		assertTrue(testobj.isPalindrome(Integer.toString(12321)));
	}
	
	@Test
	public void test5() 
	{
		assertFalse(testobj.isPalindrome(Integer.toString(123421)));
	}
	
	@Test
	public void test6() 
	{
		assertFalse(testobj.isPalindrome(Integer.toString(12311)));
	}

}
