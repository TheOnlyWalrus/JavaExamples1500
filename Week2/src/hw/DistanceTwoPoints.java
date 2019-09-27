package hw;

import java.util.Scanner;

public class DistanceTwoPoints
{
	public static void main(String[] args)
	{
		/* Creating scanner and variables */
		Scanner scanner = new Scanner(System.in);
		double x1, y1;
		double x2, y2;

		/* Getting input from user */
		System.out.print("Input x1 and y1: ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		System.out.print("Input x2 and y2: ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		scanner.close();

		/* Calculating result */
		/* x = (x2 - x1)^2 */
		double x = Math.pow(x2 - x1, 2);
		/* y = (y2 - y1)^2 */
		double y = Math.pow(y2 - y1, 2);
		/* sqrt(x - y) */
		double result = Math.sqrt(x + y);

		/* Printing out result */
		/* Prints out with 3 decimal places  */
		// System.out.printf("The distance between (%.3fx. %.3fy) and (%.3fx, %.3fy) is %.3f\n", x1, y1, x2, y2, result);
		/* Prints out full number  */
		System.out.printf("The distance between (%fx. %fy) and (%fx, %fy) is %f\n", x1, y1, x2, y2, result);
	}
}
