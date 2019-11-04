package lecture;

import java.util.Arrays;

public class Center
{
	public static void shiftCenter(double[] x)
	{
		double sum = 0;
		
		/*
		 * for (int i = 0; i < x.length; i++)
		 */
		for (double num : x)
		{
			sum += num;
		}
		
		double average = sum / x.length;
		
		for (int i = 0; i < x.length; i++)
		{
			x[i] -= average;
		}
	}
	
	public static void printArray(String message, double[] x)
	{
		for (double num : x)
		{
			System.out.println(message + num);
		}
	}
	
	public static void main(String[] args)
	{
		double[] x = new double[] {7, 13, 12, 42, 96};
		double[] y = new double[] {23.2, 14.7, 34.5, 12.4, 19.6, 4.5, 33};
//		x[0] = 7;
//		x[1] = 13;
//		x[2] = 12;
//		x[3] = 42;
//		x[4] = 96;
		shiftCenter(x);
		printArray("X ", x);
		shiftCenter(y);
		printArray("Y ", y);
		
		double[] z = new double[] {2, 7, 3, 2, 19, 7, 4, 7, 5, 3, 2, 7, 6, 8, 9, 8, 7, 12};
		printArray("Z ", z);
		System.out.println("---------------");
		Arrays.sort(z);
		printArray("Z ", z);
		
		double median;
		
		if (z.length % 2 == 1)
		{
			median = z[z.length / 2];
		}
		else
		{
			median = (z[z.length / 2] + z[z.length / 2 + 1]) / 2;
		}
		
		System.out.println("Median of Z: " + median);
	}
}
