import java.math.BigInteger;
import java.util.Scanner;

public class Problem099
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		BigInteger top = new BigInteger("0");
		
		String[] full = scanner.next().split("\n");
		scanner.close();
		
		int line = 0;
		for (String data : full)
		{
			line++;
			
			String[] list = data.split(",");
			int num = Integer.parseInt(list[0]);
			int exp = Integer.parseInt(list[1]);
			
			BigInteger result = new BigInteger("" + (int)(Math.pow(num, exp)));
			
			if (result.compareTo(top) > 0)
			{
				top = result;
			}
		}
		
		System.out.println(line);
	}
}
