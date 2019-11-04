package lecture;

import java.util.Scanner;

public class Quiz
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		/* Create problem */
		int a = (int)(20.999999 * Math.random());
		int b = (int)(20.999999 * Math.random());

		/* Fix order if necessary */
		if (b > a)
		{
			int old_a = a;
			a = b;
			b = old_a;
		}

		/* Prompt */
		System.out.printf("What is %d - %d? ", a, b);
		int answer = scanner.nextInt();
		
		scanner.close();

		/* Check answer */
		if ((a - b) == answer)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect");
		}
	}
}
