import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem003
{
	public static List<BigInteger> getPrimeFactors(BigInteger n)
	{
		List<BigInteger> factors = new ArrayList<>();
		
		BigInteger x = BigInteger.TWO;
		
		while (true)
		{
			while (n.mod(x).compareTo(BigInteger.ZERO) == 0)
			{
				factors.add(x);
				n = n.divide(x);
			}
			
			if (n.equals(BigInteger.ONE))
			{
				return factors;
			}
			
			if (x.equals(BigInteger.TWO))
			{
				x = new BigInteger("3");
			}
			else
			{
				x = x.add(BigInteger.TWO);
			}
		}
	}
	
	public static void main(String[] args)
	{
		BigInteger num = new BigInteger("600851475143");
		
		List<BigInteger> factors = getPrimeFactors(num);
		
		System.out.println(factors.toString());
	}
}
