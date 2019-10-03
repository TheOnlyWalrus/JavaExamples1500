package math;

import java.util.Scanner;

public class Euler
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("N(0), k, dt, max: ");
		double N0 = scanner.nextDouble();
		double k = scanner.nextDouble();
		double dt = scanner.nextDouble();
		double maxT = scanner.nextDouble();
		scanner.close();
		
		double old = N0;
		double _new;
		double ROC;
		
		System.out.printf("N(0) %f\n", old);
		
		for (int i = 1; i <= maxT; i += dt)
		{
			ROC = old * k * 1;
			_new = old + ROC;
			old = _new;
			System.out.printf("N(%d) %f\n", i, _new);
		}
	}
}
