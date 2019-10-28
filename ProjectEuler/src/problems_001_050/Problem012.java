package problems_001_050;

public class Problem012
{
	public static void main(String[] args)
	{
		int divisorCount = 0;
		int target = 500;
		int current = 1;
		int currentAdd = 2;
		
		while (divisorCount <= target)
		{
			for (int i = 1; i <= (int)(Math.sqrt(current)); i++)
			{
				if (current % i == 0)
				{
					divisorCount += 2;
				}
			}
			
			if (divisorCount < target)
			{
				divisorCount = 0;
				current += currentAdd;
				currentAdd++;
			}
		}
		
		System.out.println(current);
	}
}
