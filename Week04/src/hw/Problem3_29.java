package hw;

import java.util.Scanner;

public class Problem3_29
{
	public static void main(String[] args)
	{
		/* Initializing scanner */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x, y, and radius: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r1 = scanner.nextDouble();
		
		System.out.print("Enter circle2's center x, y, and radius: ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r2 = scanner.nextDouble();
		
		scanner.close();
		
		/* Distance = sqrt(pow((x2-x1), 2) + pow((y2 - y1), 2)) */
		double x_diff = x2 - x1;
		double y_diff = y2 - y1;
		double x_sq = x_diff * x_diff;
		double y_sq = y_diff * y_diff;
		double distance = Math.sqrt(x_sq + y_sq);
		
		/* Checking if circles are in each other */
		boolean c2_in_c1 = distance <= r1 - r2;
		boolean c1_in_c2 = distance <= r1 + r2;
		
		if (c2_in_c1)
		{
			System.out.println("Circle 2 is inside Circle 1");
		}
		else if (c1_in_c2)
		{
			System.out.println("Circle 1 is inside Circle 2");
		}
		else
		{
			System.out.println("Neither circle is inside of another");
		}
	}
}
