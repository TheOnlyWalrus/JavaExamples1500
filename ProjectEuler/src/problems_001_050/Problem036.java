package problems_001_050;

public class Problem036
{
	public static String reverse(String s)
	{
		String n = "";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			n = n + s.charAt(i);
		}
		
		return n;
	}
	
	public static boolean check(String b10, String b2)
	{
		String base2Reversed = reverse(b2);
		String base10Reversed = reverse(b10);
		
		if (base2Reversed.charAt(0) == '0')
			return false;
		if (base10Reversed.charAt(0) == '0')
			return false;
		
		if (!b10.equals(base10Reversed) || !b2.equals(base2Reversed))
			return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 1; i < (int)1e6; i++)
		{
			String base2 = Integer.toString(i, 2);
			String base10 = Integer.toString(i);			
			
			if (check(base10, base2))
			{
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
