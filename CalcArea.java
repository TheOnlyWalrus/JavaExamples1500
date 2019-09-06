import java.util.Scanner;

public class CalcArea
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double radius;
		double area;

		System.out.print("Input Radius: ");
		radius = input.nextDouble();
		area = Math.PI * Math.pow(radius, 2);

		System.out.println("The area of a circle with radius " + radius + " is " + area);
	}

}
