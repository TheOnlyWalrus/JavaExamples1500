package hw;

import java.util.Scanner;

public class Problem4_9
{
	public static void main(String[] args)
	{
		/* Initializing scanner */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		scanner.close();
		
		/* Converting the character to an integer */
		int unicode = (int)character;
		
		System.out.printf("The Unicode character for %c is %d", character, unicode);
	}
}
