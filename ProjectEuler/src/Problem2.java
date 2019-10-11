public class Problem2
{
	public static void main(String[] args)
	{
		int f1 = 1;
		int f2 = 1;
		int fib = f1;
		int sum = 0;
		
		while (fib < 4e6)
		{
			if (fib % 2 == 0)
			{
				sum += fib;
			}
			
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
		}
		
		System.out.println(fib);
		
		System.out.println(sum);
	}
}
