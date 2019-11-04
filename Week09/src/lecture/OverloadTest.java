package lecture;

public class OverloadTest
{
	public static int factorial(int n)
	{
		int ret = 1;
		
		for (int i = 2; i <= n; i++)
		{
			ret *= i;
		}
		
		return ret;
	}
	
	public static long factorial(long n)
	{
		long ret = 1;
		
		for (long i = 2; i <= n; i++)
		{
			ret *= i;
		}
		
		return ret;
	}
	
	public static double factorial(double n)
	{
		double ret = 1;
		
		for (double i = 2; i <= n; i++)
		{
			ret *= i;
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		for (int i = 1; i <= 50; i++)
		{
			System.out.println(i + "! = " + factorial((double)i));
		}
	}
}
