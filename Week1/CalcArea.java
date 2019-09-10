import java.util.Scanner;

public class CalcArea
{

	public static void main(String[] args)
	{
		/* Create a scanner for user input  */
		Scanner input = new Scanner(System.in);
		double radius;
		double area;

		System.out.print("Input Radius: ");
		/* Ask user for radius and reads as a double  */
		radius = input.nextDouble();
		/* Get area of circle from radius  */
		area = Math.PI * Math.pow(radius, 2);

		/* Print out area of the circle  */
		System.out.println("The area of a circle with radius " + radius + " is " + area);
	}

}
