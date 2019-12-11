package lecture;

import worldofdata.javaplots.SimplePlot;

public class LogisticEquation
{
	public static void main(String[] args)
	{
		SimplePlot sp = new SimplePlot(501, 501);
		
		/* Number of iterations */
		int n = 300;
		/* Rate */
		double rate = 3.6;
		/* For animation */
		double min_rate = rate;
		double max_rate = 3.9;
		double rate_step = 0.001;

		/* Animated */
		double[] iter = new double[n];
		int ndrop = 10;
		boolean firstDraw = true;
		
		for (; rate < max_rate; rate += rate_step)
		{
			double[] plotRate = new double[n];
			double[] pop = new double[n];
			
			pop[0] = 0.4;
			plotRate[0] = rate;
			for (int i = 1; i < n; i++)
			{
				iter[i] = i;
				pop[i] = rate * pop[i - 1] * (1 - pop[i - 1]);
				plotRate[i] = rate;
			}
			
			for (int i = 0; i < ndrop; i++)
			{
				pop[i] = 0;
				plotRate[i] = 0;
			}
			
			if (firstDraw)
			{
				sp.setData(plotRate, pop, SimplePlot.Style.MARKER);
				firstDraw = false;
			}
			else
			{
				sp.addData(plotRate, pop, SimplePlot.Style.MARKER);
			}
			
			sp.setMarkerSize(2);
			sp.setPlotBounds(min_rate, max_rate, 0, 1);
			sp.repaint();
			sp.sleep(20);
		}
	}
}
