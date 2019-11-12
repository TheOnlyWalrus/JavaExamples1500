package problems_051_100;

public class Problem052
{
	public static boolean check(int base)
	{
		for (int i = 2; i <= 6; i++)
		{
			int test = i * base;
			String strBase = Integer.toString(base);
			String strTest = Integer.toString(test);
			
			if (strBase.length() != strTest.length())
			{
				return false;
			}
			else
			{
				for (int j = 0; j < strTest.length(); j++)
				{
					if (!strBase.contains("" + strTest.charAt(j)))
					{
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		boolean found = false;
		for (double i = 1; i < 1e6 && !found; i++)
		{
			if (check((int)i))
			{
				System.out.println((int)i);
				found = true;
			}
		}
	}
}
