package hw;

import java.util.Scanner;

public class Problem3_26
{
	public static void main(String[] args)
	{
		/* Initializing scanner and variables */
		Scanner scanner = new Scanner(System.in);
		boolean both;
		boolean either;
		boolean either_not_both;
		
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		
		scanner.close();
		
		/* Computing answers */
		both = (number % 5 == 0) && (number % 6 == 0);
		either = (number % 5 == 0) || (number % 6 == 0);
		either_not_both = (number % 5 == 0) ^ (number % 6 == 0);
		
		/* Using 3 print statements for code clarity */
		System.out.printf("Is %d divisble by 5 and 6? %b\n", number, both);
		System.out.printf("Is %d divisble by 5 or 6? %b\n", number, either);
		System.out.printf("Is %d divisble by 5 or 6, but not both? %b\n", number, either_not_both);
	}
}
