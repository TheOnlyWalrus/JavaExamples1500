package lecture;

public class TwoDimArrays
{
	public static void printMatrix(double[][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.print(x[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static double[][] matrixMul(double[][] a, double[][] b)
	{
		int rowA = a.length;
		int colA = a[0].length;
		
		for (int i = 1; i < rowA; i++)
		{
			if (a[i].length != colA)
			{
				System.err.println("martixMul: Mismatch row lengths in a");
				System.exit(0);
			}
		}
		
		int rowB = b.length;
		int colB = b[0].length;
		
		for (int i = 1; i < rowB; i++)
		{
			if (b[i].length != colB)
			{
				System.err.println("martixMul: Mismatch row lengths in b");
				System.exit(0);
			}
		}
		
		if (colA != rowB)
		{
			System.err.println("matrixMul: Inner dimensions do not agree");
			System.exit(0);
		}
		
		double[][] c = new double[rowA][colB];
		
		for (int i = 0; i < rowA; i++)
		{
			for (int j = 0; j < colB; j++)
			{
				c[i][j] = 0;
				for (int k = 0; k < colA; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		double[][] x = {
			{99, 96, 72},
			{88, 84, 73},
			{95, 100, 92},
			{72, 100, 99}
		};
		
		double[][] y = {
				{0.1},
				{0.4},
				{0.5}
		};
		
		double[][] z = matrixMul(x, y);
		
		printMatrix(z);
	}
}
