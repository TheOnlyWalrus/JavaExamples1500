package lab;

import java.util.Scanner;

public class DNAReverseCompliment
{
	public static void main(String[] args)
	{
		/* Creating scanner and variables */
		Scanner scanner = new Scanner(System.in);
		String reverseCompliment = "";
		
		System.out.print("Input DNA Sequence: ");
		String dna = scanner.next().toUpperCase();
		
		scanner.close();
		
		/* Reading dna input backwards */
		for (int i = dna.length() - 1; i >= 0; i--)
		{
			char nucleotide = dna.charAt(i);
			
			/* Complimenting the dna */
			switch (nucleotide)
			{
				case 'A':
					reverseCompliment += 'T';
					break;
				case 'T':
					reverseCompliment += 'A';
					break;
				case 'G':
					reverseCompliment += 'C';
					break;
				case 'C':
					reverseCompliment += 'G';
					break;
				default:
					System.out.printf("Invalid nucleotide (%c) found at position %d\n", nucleotide, i);
					System.exit(0);
			}
		}
		
		/* Printing out the result */
		System.out.printf("The reverse compliment to\n%s\nis\n%s\n", dna, reverseCompliment);
	}
}
