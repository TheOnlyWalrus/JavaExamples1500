package lab;

public class ConvergenceSeries
{
	public static void sin(double x, double e)
	{
		double epsilon = e;
		int factorial = 1;
		double power = x;
		int sign = 1;
		int i = 1;
		int N = 0;
		double sum = 0;
		double solution = Math.sin(x);
		double term;
		
		do
		{
			term = sign * power / factorial;
			sum += term;
			N += 1;
			
			i += 2;
			sign *= -1;
			power *= x * x;
			factorial *= i * (i - 1);
		} while (Math.abs(term) > epsilon);
		
		System.out.println("N = " + N);
		
		System.out.println("x = " + x  + "\tepsilon = " + epsilon + "\tsin(x) = " + solution + "\tsum = " + sum + "\tERR = " + Math.abs(sum - solution));
	}
	
	public static void cos(double x, double e)
	{
		double epsilon = e;
		int factorial = 1;
		double power = 1;
		int sign = 1;
		int i = 0;
		int N = 0;
		double sum = 0;
		double solution = Math.cos(x);
		double term;
		
		do
		{
			term = sign * power / factorial;
			sum += term;
			N += 1;
			
			i += 2;
			sign *= -1;
			power *= x * x;
			factorial *= i * (i - 1);
		} while (Math.abs(term) > epsilon);
		
		System.out.println("N = " + N);
		
		System.out.println("x = " + x + "\tepsilon = " + epsilon + "\tcos(x) = " + solution + "\tsum = " + sum + "\tERR = " + Math.abs(sum - solution));
	}
	
	public static void exp(double x, double e)
	{
		double epsilon = e;
		int factorial = 1;
		double power = x;
		int i = 1;
		int N = 0;
		double sum = 1;
		double solution = Math.exp(x);
		double term;
		
		do
		{
			term = power / factorial;
			sum += term;
			N += 1;
			
			i += 1;
			power *= x * x;
			factorial *= i * (i - 1);
		} while (Math.abs(term) > epsilon);
		
		System.out.println("N = " + N);
		
		System.out.println("x = " + x + "\tepsilon = " + epsilon + "\texp(x) = " + solution + "\tsum = " + sum + "\tERR = " + Math.abs(sum - solution));
	}

	public static void negExp(double x, double e)
	{
		x *= -1;
		double epsilon = e;
		int factorial = 1;
		double power = x;
		int sign = 1;
		int i = 1;
		int N = 0;
		double sum = 1;
		double solution = Math.exp(x);
		double term;
		
		do
		{	
			term = sign * power / factorial;
			sum += term;
			N += 1;
			
			i += 1;
			sign *= -1;
			power *= x * x;
			factorial *= i * (i - 1);
		} while (Math.abs(term) > epsilon);
		
		System.out.println("N = " + N);
		
		System.out.println("x = " + x + "\tepsilon = " + epsilon + "\texp(x) = " + solution + "\tsum = " + sum + "\tERR = " + Math.abs(sum - solution));
	}
	
	public static void main(String[] args)
	{
		sin(0.1, 1e-3);
		cos(1, 1e-3);
		exp(0.1, 1e-6);
		negExp(1, 1e-6);
	}
}
