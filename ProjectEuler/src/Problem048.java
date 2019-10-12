import java.math.BigInteger;

public class Problem048
{
	public static void main(String[] args)
	{
		BigInteger result = BigInteger.ZERO;
		
		for (int i = 1; i <= 1000; i++)
		{
			BigInteger n = new BigInteger("" + i);
			n = n.pow(i);
			result = result.add(n);
		}
		
		System.out.println(result.toString());
	}
}
