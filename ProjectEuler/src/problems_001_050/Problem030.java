package problems_001_050;

public class Problem030
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 2; i < (int)1e6; i++)
		{
			String num = Integer.toString(i);
			int sumOf5thPowers = 0;
			
			for (int j = 0; j < num.length(); j++)
			{
				int number = Integer.parseInt("" + num.charAt(j));
				
				sumOf5thPowers += Math.pow(number, 5);
			}
			
			if (num.equals("" + sumOf5thPowers))
			{
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
