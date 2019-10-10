package lecture;

public class PalindromicNumbers
{
	public static void main(String[] args)
	{	
		int max = 0;
		int digits = 4;
		int max_i = (int)Math.pow(10, digits-1);
		int max_j = (int)Math.pow(10, digits-1);
		
		for (int i = (int)Math.pow(10, digits-1); i < (int)Math.pow(10, digits); i++)
		{
			for (int j = (int)Math.pow(10, digits-1); j < (int)Math.pow(10, digits); j++)
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
		
		System.out.printf("%d * %d = %d {Largest palindromic number that's a product of two %d digit numbers}", max_i, max_j, max, digits);;
	}
}
