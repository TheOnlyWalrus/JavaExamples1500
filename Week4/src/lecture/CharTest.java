package lecture;

import java.util.Scanner;

public class CharTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int unicode = scanner.nextInt();
		
		scanner.close();

		/* Cast int to char */
		char character = (char)unicode;

		System.out.printf("The number %d corresponds to %c\n", unicode, character);
	}
}
