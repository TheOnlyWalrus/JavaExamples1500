package ec;

public class EC1
{
	public static double factorial(int n)
	{
		double ret = 1;
		
		for (int i = 1; i <= n; i++)
		{
			ret *= i;
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		int N = 4;
		double a = 2.4;
		double x = 2.7;
		double sum = 0;
		double product = 1;
		double denom = 1;
		
		for (int i = 0; i <= N; i++)
		{
			switch (i % 4)
			{
				case 0:
					product = Math.sin(a);
					break;
				case 1:
					product = Math.cos(a);
					break;
				case 2:
					product = -Math.sin(a);
					break;
				case 3:
					product = -Math.cos(a);
					break;
			}
			
			product *= Math.pow(x - a, i);
			denom = factorial(i);
			sum += product / denom;
		}
		
		System.out.println(sum);
	}
}
