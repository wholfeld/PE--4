
public class ReverseIt {
	
		public String reverseIt(String a) 
		{
			int length = a.length();
			StringBuilder reverse = new StringBuilder();
			for(int i = length; i > 0; --i)
			{
				char result = a.charAt(i-1);
				reverse.append(result);
			}
			return reverse.toString();
		}

}
