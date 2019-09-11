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

		/* Calculating result */
		/* x = (x2 - x1)^2 */
		double x = Math.pow(x2 - x1, 2);
		/* y = (y2 - y1)^2 */
		double y = Math.pow(y2 - y1, 2);
		/* sqrt(x - y) */
		double sum = x + y;
		double result = Math.sqrt(sum);

		/* Printing out result */
		System.out.println("Distance: " + result);
	}
}
