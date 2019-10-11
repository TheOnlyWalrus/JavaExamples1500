public class Problem010
{
	public static boolean isPrime(int n)
	{
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		
		for (int i = 3; i < (int)Math.sqrt(n) + 1; i++)
		{
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		long sum = 0;
		
		for (int n = 1; n < 2e6; n++)
		{
			if (isPrime(n))
			{
				sum += n;
			}
		}
		
		System.out.println(sum);
	}
}
