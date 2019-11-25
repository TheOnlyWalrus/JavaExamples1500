package lab;

import java.awt.Color;
import javax.swing.JFileChooser;

import worldofdata.javaplots.SimplePlot;

public class PlotGlobalTemp
{
    public static String getFilePath()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileHidingEnabled(false);
        // you may need the following on Macs
        System.setProperty("apple.awt.fileDialogForDirectories", "true");


        int ret = chooser.showOpenDialog(null);
        
        if (ret == JFileChooser.APPROVE_OPTION)
        {
            return chooser.getSelectedFile().getAbsolutePath();
        }
        else
        {
            return null;
        }
    }
    
    public static double[] smooth(double[] x, int n)
	{
		double[] smoothed = new double[x.length];
		
		for (int i = n / 2; i < x.length - n / 2; i++)
		{
			double sum = 0;
			
			for (int j = i - n / 2; j <= i + n / 2; j++)
			{
				double factor = 1;
				if (n % 2 == 0 && (j == i - n / 2 || j == i + n / 2))
				{
					factor = 0.5;
				}
				
				sum += factor * x[j];
			}
			
			smoothed[i] = sum / n;
		}
		
		return smoothed;
	}

	public static void main(String[] args)
	{
//		String filepath = getFilePath();
		String filepath = "src/lab/global_temp_anomaly.txt";

        String[] lines = SimpleReader.getLines(filepath);
        double[] year = new double[lines.length];
		double[] yearAdjusted = new double[lines.length];
        double[] month = new double[lines.length];
        double[] anomaly = new double[lines.length];
        
        for(int i = 0; i < lines.length; i++)
        {
            double[] values = SimpleReader.getDoubles(lines[i]);
            year[i] = values[0];
            month[i] = values[1];
            yearAdjusted[i] = year[i] + (month[i] - 1.0) / 12.0;
            anomaly[i] = values[2];
        }

        SimplePlot sp = new SimplePlot(500, 500);
        sp.setData(yearAdjusted, smooth(anomaly, 1), Color.BLACK, SimplePlot.Style.LINE);
        sp.addData(yearAdjusted, smooth(anomaly, 12), Color.BLUE, SimplePlot.Style.LINE);
        sp.addData(yearAdjusted, smooth(anomaly, 132), Color.RED, SimplePlot.Style.LINE);
        sp.setPlotBounds(1880, 2017, -1, 1);
        sp.setMarkerSize(1);
        sp.repaint();
	}
}
