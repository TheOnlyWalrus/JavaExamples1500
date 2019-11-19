package lecture;

import worldofdata.javaplots.SimplePlot;

public class DerivativePlot
{
	public static double f(double x)
	{
		return Math.sin(-x) * Math.exp(-x * x);
	}
	
	public static double[] linspace(double min, double max, int n)
	{
		double[] ret = new double[n];
		ret[0] = min;
		ret[n-1] = max;
		
		double h = (max - min) / (n - 1);
		
		for (int i = 1; i < n - 1; i++)
		{
			ret[i] = min + i * h;
		}
		
		return ret;
	}
	
	public static double dfdx(double x, double h)
	{
		return (f(x+h) - f(x-h)) / (2 * h);
	}
	
	public static void main(String[] args)
	{
		int n = 100;
		double h = 0.001;
		double[] x = linspace(0, 10, n);
		double[] y = new double[n];
		double[] yprime = new double[n];
		
		for (int i = 0; i < n; i++)
		{
			y[i] = f(x[i]);
			yprime[i] = dfdx(x[i], h);
		}
		
		SimplePlot sp = new SimplePlot(500, 500);
		sp.setPlotBounds(0, n / 10, -5, 5);
		sp.setData(x, y);
		sp.addData(x, yprime);
		sp.repaint();
	}
}
