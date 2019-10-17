package problems_001_050;

public class Problem024
{	
	static int count = 0;
	
	private static void perms(String s, String remaining)
	{
		if (remaining.length() == 0)
		{
			count++;
			if (count == (int)1e6)
				System.out.println(s);
		}
		for (int i = 0; i < remaining.length(); i++)
		{
			String n = s + remaining.charAt(i);
			
			String nR = remaining.substring(0, i) + remaining.substring(i + 1);
			
			perms(n, nR);
		}
	}
	
	public static void main(String[] args)
	{
		perms("", "0123456789");
	}
}
