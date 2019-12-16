package hw;

public class Problem8_13
{
	public static int[] locateLargest(double[][] a)
	{
		int largeRow = 0;
		int largeCol = 0;
		double largest = Double.MIN_VALUE; // Just for comparison and start at minimum possible value
		
		for (int r = 0; r < a.length; r++)
		{
			for (int c = 0; c < a[0].length; c++)
			{
				if (a[r][c] > largest)
				{
					largest = a[r][c];
					largeRow = r;
					largeCol = c;
				}
			}
		}
		
		return new int[] {largeRow, largeCol};
	}
	
	public static void main(String[] args)
	{
		double[][] x = {
				{23.5, 35, 2, 10},
				{4.5, 3, 45, 3.5},
				{35, 44, 5.5, 9.6}
		};
		
		int[] pos = locateLargest(x);
		
		System.out.printf("The location of the largest element is at (%d, %d)\n", pos[0], pos[1]);
	}
}
