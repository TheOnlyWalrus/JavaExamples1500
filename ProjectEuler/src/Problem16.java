import java.math.BigInteger;

public class Problem16
{
	public static void main(String[] args)
	{
		int sum = 0;
		BigInteger number = new BigInteger("2").pow(1000);
		
		for (int pos = 0; pos < number.toString().length(); pos++)
		{
			String num = "" + number.toString().charAt(pos);
			sum += Integer.valueOf(num);
		}
		
		System.out.println(sum);
	}
}
