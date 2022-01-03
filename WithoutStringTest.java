/**
 * Given two strings, <b>base</b> and <b>remove</b>, return a version of the base string where all instances of the remove 
 * string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only 
 * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 *
 * Sample Test cases:
 * withoutString("Hello there", "llo") → "He there"
 * withoutString("Hello there", "e") → "Hllo thr"
 * withoutString("Hello there", "x") → "Hello there"
 *
 * Source: CodingBat, Strings3
 *
 * Solution: Katelyn Lam, Nov 2021
 */
public class WithoutStringTest
{
	/**
	 * Takes a String <code>base</code> and removes all occurrences of the String <code>remove</code>.
	 * @param base - String from which <code>remove</code> is removed. Must be >= the length of <code>remove</code>.
	 * @param remove - String of at least length 1, removed from <code>base</code>
	 * @return String - the String <code>base</code> with <code>remove</code> removed.
	 */
	public static String withoutString(String base, String remove) 
	{

	  int i = 0; //index to loop through base

		while(i < (base.length() - remove.length()+1))
		{
		  //removes all occurences of remove in base, otherwise continue to search fore remove
		  if(base.substring(i,i+remove.length()).equalsIgnoreCase(remove))
		  {
			base = base.substring(0,i)+ base.substring(i+remove.length(),base.length());
			base = withoutString(base, remove);
		  }
		  i++;
		}
	 
	  return base;
	}
	
	//tests withoutString method
	public static void main(String[] args)
	{
		System.out.println(withoutString("too funky", "o"));
		System.out.println(withoutString("Anzen Chitai V", "zen"));
		System.out.println(withoutString("With or Without You by U2", "u"));
		System.out.println(withoutString("Power, Corruption, and Lies: New Order ", "leavemealone"));
		System.out.println(withoutString("Bloc Party's This Modern Love, ", "love"));
		System.out.println(withoutString("", "Mr.Children"));
	}
}
