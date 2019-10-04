package lecture;

public class ForLoopTesting
{
	public static void main(String[] args)
	{
		System.out.println("Printing [0, 10)");
		/* i can be a double */
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Printing Σ[1, 100)");
		
		int sum = 0;
		for (int i = 1; i < 100; i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
		System.out.println("Checking if 7253 is prime");
		
		boolean isPrime = true;
		for (int i = 2; i <= (int)Math.sqrt(7253); i++)
		{
			if (7253 % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime);
		
		/* Adding up all prime numbers (1, 100) */
		System.out.println("Printing Σ Primes (1, 100)");
		sum = 0;
		for (int i = 2; i < 100; i++)
		{
			isPrime = true;
			
			for (int j = 2; j <= (int)Math.sqrt(i); j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
			{
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
