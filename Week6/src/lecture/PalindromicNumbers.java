package lecture;

public class PalindromicNumbers
{
	public static void main(String[] args)
	{	
		int max = 0;
		int max_i = 100;
		int max_j = 100;
		
		int digits = 4;
		
		for (int i = 100; i < 10000; i++)
		{
			for (int j = 100; j < 10000; j++)
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
		
		System.out.printf("%d * %d = %d {Largest palindromic number that's a product of two %d digit numbers}", max_i, max_j, max, digits);
	}
}
