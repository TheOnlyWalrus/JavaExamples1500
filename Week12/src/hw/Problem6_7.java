package hw;

public class Problem6_7
{
	public static double mean(double[] x)
	{
		double sum = 0;
		
		for (int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}
		
		return sum / x.length;
	}
	
	public static double deviation(double[] x)
	{
		double sum = 0;
		for (int i = 0; i < x.length; i++)
		{
			sum += Math.pow(x[i] - mean(x), 2);
		}
		
		return Math.sqrt(sum / (x.length - 1));
	}
	
	public static void main(String[] args)
	{
		double[] x = new double[] {2, 3, 4, 5, 6, 7, 8, 11};
		
		double deviationOfX = deviation(x);
		
		System.out.println(deviationOfX);
	}
}
