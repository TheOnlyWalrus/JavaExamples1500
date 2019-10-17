package problems_001_050;

import java.math.BigInteger;

public class Problem025
{
	public static void main(String[] args)
	{
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		BigInteger fib = f1;
		int index = 2;
		
		while (("" + fib).length() < 1000)
		{	
			fib = f1.add(f2);
			f1 = f2;
			f2 = fib;
			
			index += 1;
		}
		
		System.out.println(index);
	}
}
