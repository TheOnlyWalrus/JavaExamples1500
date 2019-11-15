package lecture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameTesting extends JFrame
{
	int[] x;
	int[] y;
	int[] size;
	Color[] colors;
	int n = 0;
	int nmax = 1000;
	int wind = 1;
	
	public FrameTesting()
	{
		initUI();
		
		x = new int[nmax];
		y = new int[nmax];
		size = new int[nmax];
		colors = new Color[nmax];
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
	
	private void initUI()
	{
		setTitle("Example");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		BufferedImage buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = buffer.createGraphics();
		
		g2.setColor(new Color(0, 200, 255));
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		for (int i = 0; i < n; i++)
		{
			Color snowColor = colors[i];
			g2.setColor(snowColor);
			g2.drawLine(x[i] - size[i] / 2, y[i] - size[i] / 2, x[i] + size[i] / 2, y[i] + size[i] / 2);
			g2.drawLine(x[i] + size[i] / 2, y[i] - size[i] / 2, x[i] + size[i] / 2, y[i] - size[i] / 2);
		}
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(buffer, null, 0, 0);
	}
	
	public static void main(String[] args)
	{
		FrameTesting ex = new FrameTesting();
        ex.setVisible(true);

        for(int i = 0; i < ex.nmax; i++)
        {
        	if (ex.n < ex.nmax)
        	{
        		/* Create at top of screen */
        		ex.y[ex.n] = 0;
        		/* Choose random x value */
        		ex.x[ex.n] = (int)(ex.getWidth() * Math.random());
        		/* Random size */
        		ex.size[ex.n] = (int)((Math.random() + 1) * 5);
        		/* Color scale */
        		int scale = (int)(200 + 55 * Math.random());
        		ex.colors[ex.n] = new Color(scale, scale, scale);
        		/* Next */
        		ex.n++;
        	}
        	
        	for (int j = 0; j < ex.n; j++)
        	{
        		if (ex.y[j] < ex.getHeight() - 15)
        		{
        			ex.y[j] += (ex.size[i] / 4) * (ex.size[j] / 4);
        		}
        		
        		if (ex.x[j] < ex.getWidth() && ex.x[j] > 0 && ex.y[j] < ex.getHeight() - 15)
        		{
        			ex.x[j] += ex.wind;
        		}
        		
        		if (ex.x[j] >= ex.getWidth() || ex.x[j] <= 0)
        		{
        			ex.y[j] = 0;
            		ex.x[j] = (int)(ex.getWidth() * Math.random());
            		ex.size[j] = (int)((Math.random() + 1) * 5);
            		int scale = (int)(200 + 55 * Math.random());
            		ex.colors[j] = new Color(scale, scale, scale);
        		}
        	}
        	
        	ex.sleep(10);
        	ex.repaint();
        }
	}
}
