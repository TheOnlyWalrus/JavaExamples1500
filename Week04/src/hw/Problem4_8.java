package hw;

import java.util.Scanner;

public class Problem4_8
{
	public static void main(String[] args)
	{
		/* Initializing scanner */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int ascii = scanner.nextInt();
		scanner.close();
		
		/* Converting the integer to a character */
		char character = (char)ascii;
		
		System.out.printf("The character for ASCII code %d is %c", ascii, character);
	}
}
