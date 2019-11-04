package lab;

public class AdaptiveTrapezoidalRule
{
	static int count = 0;
	static boolean depthErrorPrinted = false;
	
	public static double f(double x)
	{
		return Math.sin(x);
	}
	
	public static double trapezoid(double a, double b, double epsRel, double epsAbs, int depth, int minDepth, int maxDepth)
	{
		double mid = (a + b) * 0.5;
		double trap1 = 0.5 * (f(a) + f(b)) * (b - a);
		double trap2 = 0.25 * (f(a) + 2.0 * f(mid) + f(b)) * (b - a);
		
		if (depth >= maxDepth)
		{
			if (!depthErrorPrinted)
			{
				System.out.println("Warning: Max depth reached");
				System.out.printf("a, mid, b = %f, %f, %f", a, mid, b);
				depthErrorPrinted = true;
			}
			
			count++;
			return trap2;
		}
		else if ((Math.abs(trap2 - trap1) / (trap2 + trap1)) < epsRel || Math.abs(trap2 - trap1) < epsAbs && depth >= minDepth)
		{
			count++;
			return trap2;
		}
		else
		{
			return trapezoid(a, mid, epsRel, epsAbs, depth + 1, minDepth, maxDepth) + trapezoid(mid, b, epsRel, epsAbs, depth + 1, minDepth, maxDepth);
		}
	}
	
	public static void main(String[] args)
	{
		double eps = 1.0e-9;
		double a = 0;
		double b = Math.PI;
		int depth = 0;
		int minDepth = 2;
		int maxDepth = 20;
		
		System.out.println(trapezoid(a, b, eps, eps, depth, minDepth, maxDepth));
		System.out.println(count);
	}
}
