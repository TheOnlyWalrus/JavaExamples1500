package problems_001_050;

public class Problem004
{
	public static void main(String[] args)
	{	
		int max = 0;
		int max_i = 100;
		int max_j = 100;
		
		for (int i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++)
			{
				int n = i * j;
				String s = "" + n;
				
				int pos = 0;
				boolean isPalindrome = true;
				while (isPalindrome && pos <= s.length() / 2 - 1)
				{
					if (s.charAt(pos) != s.charAt(s.length() - pos - 1))
					{
						isPalindrome = false;
					}
					
					pos++;
				}
				
				if (isPalindrome)
				{
					if (n > max)
					{
						max = n;
						max_i = i;
						max_j = j;
					}
				}
			}
		}
		
		System.out.printf("%d * %d = %d", max_i, max_j, max);
	}
}
