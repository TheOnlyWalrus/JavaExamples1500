import java.util.Scanner;

public class CountDNANucleotides
{
	public static void main(String[] args)
	{
		/* Creating scanner and default variables */
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int T = 0;
		int G = 0;
		int C = 0;
		int count = 0;

		/* Reading input from scanner */
		String dna = scanner.next().toUpperCase();

		/* Closing the scanner */
		scanner.close();

		/* Go through every index of the string */
		for(int i = 0; i < dna.length(); i++)
		{
			/* Get character (nucleotide) at the current index */
			char nucleotide = dna.charAt(i);

			/* Create a switch for the nucleotide types */
			switch (nucleotide)
			{
				case 'A':
					A += 1;
					count += 1;
					break;
				case 'T':
					T += 1;
					count += 1;
					break;
				case 'G':
					G += 1;
					count += 1;
					break;
				case 'C':
					C += 1;
					count += 1;
					break;
				/* If character isn't A, T, G, or C, exit */
				default:
					System.out.printf("Invalid nucleotide \"%c\" at position %d\n", nucleotide, i);
					System.exit(0);
			}
		}

		/* Printing out results */
		System.out.printf("Nucleotide count: %d\nA count: %d\nT count: %d\nG count: %d\nC count: %d\n", count, A, T, G, C);
	}
}
