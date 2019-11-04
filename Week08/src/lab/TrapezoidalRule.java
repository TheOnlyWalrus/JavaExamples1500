package lab;

public class TrapezoidalRule
{
	public static double f(double x)
	{
		return Math.sin(x);
	}
	
	public static void main(String[] args)
	{
		int nTrapezoids = 1000;
		double a = 0;
		double b = Math.PI;
		double h = (b - a) / nTrapezoids;
		double sum = 0.5 * f(a);
		
		for (int i = 0; i < nTrapezoids; i++)
		{
			sum += f(a + i * h);
		}
		
		sum += 0.5 * f(b);
		sum *= h;
		
		/* Using println instead of printf for more precision */
		System.out.println("Area = " + sum);
	}
}
