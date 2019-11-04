package lecture;

import java.util.Scanner;

public class DaysOfMonth
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month as an integer: ");
		int month = scanner.nextInt();
		
		scanner.close();

		if (month == 2)
		{
			System.out.println("No no no, I'm not dealing with feburary. It's most likely 28 days.");
		}
		else if (month % 2 == 1 && month <= 12 && month > 0)
		{
			System.out.println("That month has 31 days.");
		}
		else if (month % 2 == 0 && month <= 12 && month > 0)
		{
			System.out.println("That month has 30 days.");
		}
		else
		{
			System.out.println("Invalid month");
		}
	}
}
