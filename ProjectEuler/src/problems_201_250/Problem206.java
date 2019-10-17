package problems_201_250;
import java.math.BigInteger;

public class Problem206
{
	public static boolean match(BigInteger n)
	{
		BigInteger square = n.pow(2);
		
		int[] R2L = { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		int idx = 0;
		
		while (square.compareTo(BigInteger.ZERO) > 0)
		{
			BigInteger digit = square.mod(new BigInteger("10"));
			
			if (!digit.equals(new BigInteger("" + R2L[idx++])))
			{
				return false;
			}
			
			square = square.divide(new BigInteger("100"));
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int min = 1010101010;
		int max = 1389026620;
		
		for (int i = max; i >= min; i -= 10)
		{
			if (match(new BigInteger("" + i)))
			{
				System.out.println(i);
			}
		}
	}
}
