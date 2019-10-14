public class Problem034
{
	public static int factorial(int n)
	{
		int ret = 1;
		
		for (int i = 1; i <= n; i++)
		{
			ret *= i;
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 3; i < 10000000; i++)
		{
			int sumOfDigits = 0;
			String num = Integer.toString(i);
			for (int j = 0; j < num.length(); j++)
			{
				sumOfDigits += factorial(Integer.parseInt("" + num.charAt(j)));
			}
			
			if (Integer.toString(sumOfDigits).equals(num))
			{
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
