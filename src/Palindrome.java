
public class Palindrome {
	

	private int startingDigit;
	
	private int my_current_product;
	private int my_largest_product;
	
	public Palindrome(int a)
	{
		startingDigit = a;
		my_largest_product = 0;
		int one_less_digit = (startingDigit/10);
		
		for (int i = startingDigit; i > one_less_digit; i--)
		{
			for (int j = startingDigit; j > one_less_digit; j--)
			{
				checkPalindrome(i, j);
			}
		}
	}
	
	private void checkPalindrome(int the_var1, int the_var2)
	{
		my_current_product = the_var1 * the_var2;
		String s = Integer.toString(my_current_product);
		
		if(isPalindrome(s))
		{
			if(my_current_product>my_largest_product)
			{
				my_largest_product = my_current_product;
			}
		}
		
	}
	
	public boolean isPalindrome(String s)
	{
		boolean result = false;
		int len = s.length();
		ReverseIt it = new ReverseIt();
		if(len%2==0)
		{
			
			String part2reversed = it.reverseIt(s.substring(len/2, len));
			if(s.substring(0, len/2).equalsIgnoreCase(part2reversed))
			{
				result = true;
			}
							
		}
		else
		{
			String part2reversed = it.reverseIt(s.substring(len/2+1, len));
			if(s.substring(0, len/2).equalsIgnoreCase(part2reversed))
			{
				result = true;
			}
		}
		
		return result;
	}
	
	public int getLargestPalindrome()
	{
		return my_largest_product;
	}

}
