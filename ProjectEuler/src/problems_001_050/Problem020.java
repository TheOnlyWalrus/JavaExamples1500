package problems_001_050;

import java.math.BigInteger;

public class Problem020
{
	public static BigInteger factorial(int n)
	{
		BigInteger ret = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++)
		{
			ret = ret.multiply(new BigInteger("" + i));
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		BigInteger number = factorial(100);
		String numberString = number.toString();
		int sum = 0;
		
		for (int i = 0; i < numberString.length(); i++)
		{
			int num = Integer.parseInt("" + numberString.charAt(i));
			
			sum += num;
		}
		
		System.out.println(sum);
	}
}
