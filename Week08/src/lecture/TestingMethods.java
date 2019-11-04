package lecture;

public class TestingMethods
{
	public static void tryToChangeX(int x)
	{
		x++;
		System.out.println("Inside of method (ttcx): x=" + x);
	}
	
	public static int tryToChangeXButActuallyChangingIt(int x)
	{
		x++;
		return x;
	}
	
	/*
	 * public: Is visible to other programs and classes
	 * static: This exists on its own
	 * boolean: Return value
	 */
	public static boolean isPrime(int num)
	{
		if (num < 2)
		{
			return false;
		}
		
		if (num == 2)
		{
			return true;
		}
		
		for (int i = 2; i <= (int)Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * int: Return value
	 * int ...nums: More than one number can be provided, no set amount
	 */
	public static int max(int ...nums)
	{
		int max = 0;
		for (int num : nums)
		{
			if (num > max)
			{
				max = num;
			}
		}
		
		return max;
	}
	
	/*
	 * void: Return type (null or no return)
	 * String[] args: A list of strings given from cla
	 */
	public static void main(String[] args)
	{
		System.out.println(max(1, 2, 3, 4, 5, 9, 2));
		int x = 4;
		tryToChangeX(x);
		System.out.println("Outside of method (ttcx): x=" + x);
		x = tryToChangeXButActuallyChangingIt(x);
		System.out.println("Outside of method (ttcxbaci): x=" + x);
	}
}
