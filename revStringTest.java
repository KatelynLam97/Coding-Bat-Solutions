/**
 * Reverses a String using recursion. Base case returns an empty String, otherwise return the last character of the String,
 * and calls the method for a String with the last character removed.
 */
public class revStringTest
{
	/**
	 * method that reverses a String recursively.
	 * @param s - String that is to be reversed
	 * @return String - String of s that is reversed
	 */
	public static String revString(String s)
	{
		int startIndex = s.length();
		String reversed = "";
		
		//returns empty String if s is an empty String
		if(startIndex == 0)
			return "";
		
		/*returns the rightmost character of the String recursively, shortening the String by taking out the rightmost character
		until the length of the String is 0*/
		else
		{
			reversed = s.substring(startIndex - 1, startIndex) + revString(s.substring(0,startIndex - 1));
			return reversed;
		}
		
	}
	
	//tests revString() method
	public static void main(String[] args)
	{
		System.out.println(revString("hello"));
		System.out.println(revString("Movement"));
		System.out.println(revString("Power, Corruption, and Lies"));
		System.out.println(revString("LOWLIFE"));
		System.out.println(revString("brother		hood"));
		System.out.println(revString("techniqueeeee"));
		System.out.println(revString(""));
	}
}
			
			