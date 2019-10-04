package lab;

import java.util.Scanner;

public class FindAllSubstringIndices
{
	public static void main(String[] args)
	{
		/* Creating scanner and variables */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input DNA Sequence: ");
		String dna = scanner.next().toUpperCase();
		System.out.print("Input Pattern to Find: ");
		String pattern = scanner.next().toUpperCase();
		
		scanner.close();
		
		/* Searching through dna to find pattern */
		for (int i = 0; i < dna.length(); i++)
		{
			/* If the search is past the length of dna, break */
			if (i + pattern.length() > dna.length())
			{
				break;
			}
			
			/* Get substring of dna */
			String substring = dna.substring(i, i + pattern.length());
			
			/* If substring is equal to the pattern, print out the index of the pattern */
			if (substring.equals(pattern))
			{
				System.out.printf("%d ", i + 1);
			}
		}
		
		/* Print out a newline character */
		System.out.println();
	}
}
