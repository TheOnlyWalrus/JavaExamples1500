package hw;

public class Problem8_1
{
	public static double sumColumn(double[][] x, int columnIndex)
	{
		double sum = 0;
		
		for (int r = 0; r < x.length; r++)
		{
			sum += x[r][columnIndex];
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		double[][] x = {
				{1.5, 2, 2, 4},
				{5.5, 6, 7, 8},
				{9.5, 1, 3, 1}
		};
		
		for (int c = 0; c < x[0].length; c++)
		{
			double result = sumColumn(x, c);
			
			System.out.printf("Sum of the elements at column %d is %f\n", c, result);
		}
	}
}
