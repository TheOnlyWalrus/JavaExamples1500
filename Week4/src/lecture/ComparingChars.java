package lecture;

public class ComparingChars
{
	public static void main(String[] args)
	{
		char a = 'a';
		char b = 'b';
		char A = 'A';
		char B = 'B';

		if (a == A)
		{
			System.out.println("a == A");
		}
		else
		{
			System.out.println("a != A");
		}

		if (a < b)
		{
			System.out.println("a < b");
		}
		else
		{
			System.out.println("a > b");
		}

		if (a < B)
		{
			System.out.println("a < B");
		}
		else
		{
			System.out.println("a > B");
		}
	}
}
