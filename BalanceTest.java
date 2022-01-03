/**
 * Problem: Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on 
 * one side is equal to the sum of the numbers on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 * Source: CodingBat, Array-3 canBalance
 * 
 * Solution: Katelyn Lam, Nov 2021
 */
public class BalanceTest
{
	/**
	 * Takes an array and returns true if it can be split into two equal sums, otherwise
	 * returns false.
     * @param nums - an array of integers
     * @return boolean - whether there is a point in the array where the sum of the 
     * numbers before the point is equal to the sum of the numbers behind the point
	 */
	public static boolean canBalance(int[] nums) 
	{
	  int sumForward = 0; //sum of the numbers counting from the start of the array
	  int sumBackward = 0; //sum of numbers counting from the back of the array
	  
	  for(int i = 0; i < nums.length; i++)
	  {
		sumForward = sumForward + nums[i]; //takes sum of all numbers from the start to i
		
		//takes sum of all numbers from i to the end of the array
		for(int j = (nums.length - 1); j > i; j--)
		{
		  sumBackward = sumBackward + nums[j];
		}
		
		if(sumBackward == sumForward) //returns true if a matching sum is found
			return true;
		sumBackward = 0;
	  }
	  return false; //returns false if no sum has been found
	}
	
	/**
	 * test cases for canBalance() method
	 */
	public static void main(String[] args)
	{
		int[] array1 = {};
		int[] array2 = {3,4,5,2};
		int[] array3 = {1,2,3,7,1,5};
		int[] array4 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] array5 = {4,243,65,2,80,55,45}; 
		
		System.out.println(canBalance(array1));
		System.out.println(canBalance(array2));
		System.out.println(canBalance(array3));
		System.out.println(canBalance(array4));
		System.out.println(canBalance(array5));
	}
		
	
}