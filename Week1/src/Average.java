import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double average = 0.0;
		int count = 0;

		while (scanner.hasNextDouble())
		{
			double x = scanner.nextDouble();
			count++;
			System.out.println("Entry " + count + ": " + x);
			average += x;
		}
		
		scanner.close();

		if (count > 0)
		{
			average /= count;
			System.out.println("Average: " + average);
		}
		else
		{
			System.out.println("Problem with input\nNo values entered");
		}
	}
}
