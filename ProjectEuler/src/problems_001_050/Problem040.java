package problems_001_050;

public class Problem040
{
	public static void main(String[] args)
	{
		int product = 1;
		String s = "";
		
		for (int i = 1; s.length() < 1000000; i++)
		{
			s += i;
		}
		
		for (int i = 1; i <= 1000000; i *= 10)
		{
			System.out.println(product);
			product *= Integer.parseInt("" + s.charAt(i - 1));
		}
		
		System.out.println(product);
	}
}
