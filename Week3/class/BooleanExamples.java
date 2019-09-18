import java.util.Scanner;

public class BooleanExamples
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = scanner.nextInt();

		if (x > 0)
		{
			System.out.println(x + " is a positive integer");
		}
		else if (x < 0)
		{
			System.out.println(x + " is a negative integer");
		}
		else
		{
			System.out.println(x + " is zero");
		}
	}
}
