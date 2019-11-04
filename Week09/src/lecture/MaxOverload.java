package lecture;

public class MaxOverload
{
	public static String max(String a, String b)
	{
		if (a.toLowerCase().compareTo(b.toLowerCase()) > 0)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static int max(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static long max(long a, long b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static float max(float a, float b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static double max(double a, double b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static char max(char a, char b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static void main(String[] args)
	{
		int a = 200;
		int b = -1;
		System.out.println(max(a, b));
		double x = 4;
		double y = 5;
		System.out.println(max(x, y));
		System.out.println(max(a, y));
		String foo = "Aardvark";
		String boo = "Zebra";
		System.out.println(max(foo, boo));
		char bar = 'A';
		char baz = 'z';
		System.out.println(max(bar, baz));
	}
}
