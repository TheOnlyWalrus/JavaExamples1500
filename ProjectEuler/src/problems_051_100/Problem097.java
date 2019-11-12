package problems_051_100;

import java.math.BigInteger;

public class Problem097
{
	public static void main(String[] args)
	{
		BigInteger num = BigInteger.TWO;
		num = num.pow(7830457);
		num = num.multiply(new BigInteger("28433"));
		num = num.add(BigInteger.ONE);
		
		System.out.println(num.toString().substring(num.toString().length() - 10));
	}
}
