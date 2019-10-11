public class Problem5
{
	public static void main(String[] args)
	{
		int num = 20;
		boolean isDivisible = true;
		
		while (true)
		{
			for (int i = 1; i <= 20; i++)
			{
				if (num % i == 0)
				{
					continue;
				}
				else
				{
					isDivisible = false;
					break;
				}
			}
			
			if (isDivisible)
				break;
			isDivisible = true;
			num += 1;
		}
		
		System.out.println(num);
	}
}
