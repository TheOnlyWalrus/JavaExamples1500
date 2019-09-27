import java.util.Scanner;

public class CountRNANucleotidesAndPattern
{
	public static void main(String[] args)
	{
		/* Creating scanner and default variables */
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int U = 0;
		int G = 0;
		int C = 0;
		int pattern_count = 0;

		/* Reading input from scanner */
		String rna = scanner.next().toUpperCase();
		String pattern = scanner.next().toUpperCase();
		/* Closing the scanner */
		scanner.close();

		/* Go through every index of the string */
		for(int i = 0; i < rna.length(); i++)
		{
			/* Get character (nucleotide) at the current index */
			char nucleotide = rna.charAt(i);

			/* Create a switch for the nucleotide types */
			switch (nucleotide)
			{
				case 'A':
					A += 1;
					break;
				case 'U':
					U += 1;
					break;
				case 'G':
					G += 1;
					break;
				case 'C':
					C += 1;
					break;
				/* If character isn't A, U, G, or C, exit */
				default:
					System.out.printf("Invalid nucleotide \"%c\" at position %d\n", nucleotide, i);
					System.exit(0);
			}

			/* Searching for pattern in rna string */
			if (i <= rna.length() - pattern.length())
			{
				String find_pattern = rna.substring(i, i + pattern.length());
				if (find_pattern.equals(pattern))
				{
					pattern_count += 1;
				}
			}
		}

		/* Printing out results */
		System.out.printf("Nucleotide count: %d\nA count: %d\nU count: %d\nG count: %d\nC count: %d\nPattern count (%s): %d\n", dna.length(), A, U, G, C, pattern, pattern_count);
	}
}
