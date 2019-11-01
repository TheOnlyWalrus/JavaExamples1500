package lecture;

public class ArrayTesting
{
	public static void main(String[] args)
	{
		/* One of the fastest ways to get all prime numbers up to one point */
		
		int n = 99999999;
		boolean[] isPrime = new boolean[n + 1];
		
		for (int i = 0; i <= n; i++)
		{
			isPrime[i] = true;
		}
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for (int i = 2; i <= n; i++)
		{
			if (isPrime[i])
			{
				for (int j = i + i; j <= n; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
		
		for (int i = 0; i <= n; i++)
		{
			if (isPrime[i])
			{
				
			}
		}
	}
}
