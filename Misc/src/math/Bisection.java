package math;

import java.math.BigDecimal;

public class Bisection
{
	public static BigDecimal f(BigDecimal x)
	{
		return x.pow(2).subtract(new BigDecimal("2"));
	}
	
	public static void main(String[] args)
	{
		BigDecimal x = BigDecimal.ZERO;
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = new BigDecimal("2");
		
		for (int i = 0; i < 1000; i++)
		{
			x = new BigDecimal("0.5").multiply(a.add(b));
			
			BigDecimal fa = f(a);
			BigDecimal fx = f(x);
			BigDecimal fb = f(b);
			
			if (fa.multiply(fx).compareTo(BigDecimal.ZERO) < 0)
			{
				b = x;
			}
			else if (fb.multiply(fx).compareTo(BigDecimal.ZERO) < 0)
			{
				a = x;
			}
		}
		
		System.out.println(x);
	}
}
