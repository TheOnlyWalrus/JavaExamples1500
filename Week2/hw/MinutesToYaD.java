import java.util.Scanner;

public class MinutesToYaD
{
	public static void main(String[] args)
	{		
		/* Creating scanner and variables */
		Scanner scanner = new Scanner(System.in);
		int years;
		int days;
		int minutes;

		/* Getting minutes from user */
		System.out.print("Input amount of minutes to be converted to years and days: ");
		minutes = scanner.nextInt();

		/* Converting minutes to years and days */
		/* Time to sing along with Rent? */
		/* One year = 525600 minutes */
		years = minutes / 525600;
		/* One hour = 1440 minutes */
		/* days = (minutes left after calculating years) / 1440 */
		days = (minutes % 525600) / 1440;

		/* Printing out years and hours from minutes */
		// System.out.println(minutes + " minutes is " + years + " year(s) and " + days + " day(s)");
		System.out.printf("%d minutes is %d year(s) and %d day(s)\n", minutes, years, days);
	}
}
