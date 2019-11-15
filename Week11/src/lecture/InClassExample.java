package lecture;

import java.awt.Color;

import worldofdata.javaplots.SimpleBox;
import worldofdata.javaplots.SimpleHist;
import worldofdata.javaplots.SimplePlot;

public class InClassExample
{
	public static double[] linspace(double min, double max, int n)
	{
		double[] ret = new double[n];
		ret[0] = min;
		ret[n - 1] = max;
		double step = (max - min) / (n - 1);
		
		for (int i = 1; i < n - 1; i++)
		{
			ret[i] = min + i * step;
		}
		
		return ret;
	}
	
	public static void main(String[] args)
	{
		int n = 100;
		
		double[] x = linspace(-1, 1, n);
		double[] y = new double[n];
		
		for (int i = 0; i < n; i++)
		{
			y[i] = Math.exp(-x[i] * x[i]);
		}
		
		SimplePlot sp = new SimplePlot(600, 600);
		sp.setPlotBounds(-10, 10, 0, 1);
		sp.setData(x, y, Color.RED, SimplePlot.Style.LINE);
		sp.repaint();
		
		double[] commuteTime = new double[] {25, 25, 10, 15, 60, 8, 8, 13, 25, 5, 5, 21, 80, 15, 30, 90};
		
		SimpleHist sh = new SimpleHist(400, 400);
		sh.setPlotBounds(0, 100, 0, 10);
		sh.setPreferredNumBins(20);
		sh.setData(commuteTime);
		sh.repaint();
		
		SimpleBox sb = new SimpleBox(400, 400);
		sb.setPlotBounds(0, 100, 0, 10);
		sb.setData(commuteTime);
		sb.repaint();
	}
}
