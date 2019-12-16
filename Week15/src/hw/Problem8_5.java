package hw;

public class Problem8_5
{
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] newMatrix = new double[a.length][a[0].length];
		
		if (a.length != b.length || a[0].length != b[0].length)
		{
			System.out.println("Matrices must be the same size");
			System.exit(0);
		}
		
		for (int r = 0; r < a.length; r++)
		{
			for (int c = 0; c < a[0].length; c++)
			{
				newMatrix[r][c] = a[r][c] + b[r][c];
			}
		}
		
		return newMatrix;
	}
	
	public static void printMatrix(double[][] x)
	{
		for (int r = 0; r < x.length; r++)
		{
			for (int c = 0; c < x[0].length; c++)
			{
				System.out.print(x[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		double[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		double[][] b = {
				{0, 2, 4},
				{1, 4.5, 2.2},
				{1.1, 4.3, 5.2}
		};
		
		double[][] c = addMatrix(a, b);
		
		printMatrix(c);
	}
}
