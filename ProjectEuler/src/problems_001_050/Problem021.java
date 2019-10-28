package problems_001_050;

import java.util.ArrayList;
import java.util.List;

public class Problem021
{
	public static int d(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= (int)(n / 2); i++)
		{
			if (n % i == 0)
			{
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		List<Integer> doNotCheck = new ArrayList<>();
		
		for (int a = 1; a < 10000; a++)
		{
			if (!doNotCheck.contains(a))
			{
				int da = d(a);
				int b = da;
				int db = d(b);
				
				if (da == b && db == a && a != b)
				{
					doNotCheck.add(b);
					sum += a + b;
				}
			}
		}
		
		System.out.println(sum);
	}
}
