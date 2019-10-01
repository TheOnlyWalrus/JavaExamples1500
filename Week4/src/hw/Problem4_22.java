package hw;

import java.util.Scanner;

public class Problem4_22
{
	public static void main(String[] args)
	{
		/* Initializing scanner and variables */
		Scanner scanner = new Scanner(System.in);
		boolean is_substring = false;
		
		System.out.print("Enter string 1: ");
		String s1 = scanner.next();
		System.out.print("Enter string 2: ");
		String s2 = scanner.next();
		scanner.close();
		
//		for (int i = 0; i < s1.length(); i++)
//		{
//			/* Searching for s2 in s1 */
//			if (i <= s1.length() - s2.length())
//			{
//				String find_pattern = s1.substring(i, i + s2.length());
//				if (find_pattern.equals(s2))
//				{
//					is_substring = true;
//					break;
//				}
//			}
//		}
		
		/* Instead of using a for loop, for this purpose you can use String.contains */
		is_substring = s1.contains(s2);
		
		System.out.printf("Is %s a substring of %s? %b", s1, s2, is_substring);
	}
}
