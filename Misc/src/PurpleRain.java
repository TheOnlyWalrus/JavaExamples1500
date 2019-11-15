import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PurpleRain extends JFrame
{
	int[] x;
	int[] y;
	int[] length;
	Color[] colors;
	int n = 0;
	int max = 1000;
	
	public PurpleRain()
	{
		init();
		
		x = new int[max];
		y = new int[max];
		length = new int[max];
		colors = new Color[max];
	}
	
	public void sleep(int ms)
	{
		try
		{
			Thread.sleep(ms);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private void init()
	{
		setTitle("Purple rain");
		setSize(1000, 1000);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		BufferedImage buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = buffer.createGraphics();
		
		g2.setColor(new Color(0, 0, 0));
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		for (int i = 0; i < n; i++)
		{
			Color rainColor = colors[i];
			g2.setColor(rainColor);
			g2.drawLine(x[i], y[i] - length[i] / 2, x[i], y[i] + length[i] / 2);
		}
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(buffer, null, 0, 0);
	}
	
	public static void main(String[] args)
	{
		PurpleRain ex = new PurpleRain();
        ex.setVisible(true);

        for(;;)
        {
        	if (ex.n < ex.max)
        	{
        		/* Create at top of screen */
        		ex.y[ex.n] = 0;
        		/* Choose random x value */
        		ex.x[ex.n] = (int)(ex.getWidth() * Math.random());
        		/* Random size */
        		ex.length[ex.n] = (int)((Math.random() + 1) * 5);
        		/* Color scale */
        		int scale = (int)(200 + 55 * Math.random());
        		ex.colors[ex.n] = new Color(scale, 0, 255);
        		/* Next */
        		ex.n++;
        	}
        	
        	for (int j = 0; j < ex.n; j++)
        	{
        		if (ex.y[j] < ex.getHeight())
        		{
        			ex.y[j] += (ex.length[j] / 4);
        		}
        		else
        		{
        			/* Create at top of screen */
            		ex.y[j] = 0;
            		/* Choose random x value */
            		ex.x[j] = (int)(ex.getWidth() * Math.random());
            		/* Random size */
            		ex.length[j] = (int)((Math.random() + 1) * 5);
            		/* Color scale */
            		int scale = (int)(200 + 55 * Math.random());
            		ex.colors[j] = new Color(scale, 0, 255);
        		}
        	}
        	
        	ex.sleep(10);
        	ex.repaint();
        }
	}
}
