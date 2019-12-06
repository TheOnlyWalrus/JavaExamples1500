import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Lewis2D extends JFrame
{
	private static final long serialVersionUID = -8664080449170670808L;
	
	Element[] elements;
	int[] x;
	int[] y;
	
	public Lewis2D(Element ...elements)
	{
		this.elements = elements;
		
		this.x = new int[this.elements.length];
		this.y = new int[this.elements.length];
		
		for (int i = 0; i < this.elements.length; i++)
		{
			this.x[i] = (int)(Math.random() * 512);
			this.y[i] = (int)(Math.random() * 512);
		}
	}
	
	public void paint(Graphics g)
	{
		BufferedImage buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = buffer.createGraphics();
		
		g2.setColor(new Color(0, 0, 0));
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		for (int i = 0; i < this.elements.length; i++)
		{
			Color color = Color.WHITE;
			Color textColor = Color.YELLOW;
			
			int next;
			if (i + 1 >= this.elements.length)
				next = 0;
			else
				next = i + 1;
			
			int x = this.x[i];
			int y = this.y[i];
			int size = 25;
			
			g2.setColor(color);
			g2.drawOval(x, y, size, size);
			char[] chars = this.elements[i].symbol.toCharArray();
			g2.setColor(textColor);
			g2.drawChars(chars, 0, chars.length, x + size / 3, y + (int)(size / 1.5));
			
			g2.drawLine(x, y, this.x[next], this.y[next]);
		}
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(buffer, null, 0, 0);
	}
	
	public void generate()
	{
		setTitle("Lewis 2D");
		setSize(512, 512);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
