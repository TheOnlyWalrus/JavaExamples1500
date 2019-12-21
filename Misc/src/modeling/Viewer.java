package modeling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Viewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		pane.setLayout(new BorderLayout());
		
		JSlider headingSlider = new JSlider(0, 360, 180);
		headingSlider.addChangeListener(e -> pane.repaint());
		pane.add(headingSlider, BorderLayout.SOUTH);
		
		JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
		pitchSlider.addChangeListener(e -> pane.repaint());
		pane.add(pitchSlider, BorderLayout.EAST);
		
		List<Triangle> triangles = new ArrayList<>();
		triangles.add(new Triangle(new Vertex(100, 100, 100),
				   				   new Vertex(-100, -100, 100),
				   				   new Vertex(-100, 100, -100),
				   				   Color.WHITE));
		triangles.add(new Triangle(new Vertex(100, 100, 100),
								   new Vertex(-100, -100, 100),
								   new Vertex(100, -100, -100),
								   Color.RED));
		triangles.add(new Triangle(new Vertex(-100, 100, -100),
								   new Vertex(100, -100, -100),
								   new Vertex(100, 100, 100),
								   Color.GREEN));
		triangles.add(new Triangle(new Vertex(-100, 100, -100),
								   new Vertex(100, -100, -100),
								   new Vertex(-100, -100, 100),
								   Color.BLUE));
		
		JPanel renderPanel = new JPanel()
		{
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g)
			{
				Graphics2D g2 = (Graphics2D)g;
				g2.setColor(Color.BLACK);
				g2.fillRect(0, 0, getWidth(), getHeight());
				g2.setColor(Color.WHITE);
				
				double heading = Math.toRadians(headingSlider.getValue());
				Matrix3 headingTransform = new Matrix3(new double[] {
				        Math.cos(heading), 0, Math.sin(heading),
				        0, 1, 0,
				        -Math.sin(heading), 0, Math.cos(heading)
				    });
				double pitch = Math.toRadians(pitchSlider.getValue());
				Matrix3 pitchTransform = new Matrix3(new double[] {
						1, 0, 0,
						0, Math.cos(pitch), Math.sin(pitch),
						0, -Math.sin(pitch), Math.cos(pitch)
				});
				Matrix3 transform = headingTransform.multiply(pitchTransform);
				
				g2.translate(getWidth() / 2, getHeight() / 2);
				g2.setColor(Color.WHITE);
				
				BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
				
				for (Triangle t : triangles)
				{
					Vertex v1 = transform.transform(t.v1);
					Vertex v2 = transform.transform(t.v2);
					Vertex v3 = transform.transform(t.v3);
					
					v1.x += getWidth() / 2;
					v1.y += getHeight() / 2;
					v2.x += getWidth() / 2;
					v2.y += getHeight() / 2;
					v2.x += getWidth() / 2;
					v2.y += getHeight() / 2;
					
					int minX = (int)Math.max(0, Math.ceil(Math.min(v1.x, Math.min(v2.x, v3.x))));
					int maxX = (int)Math.min(img.getWidth() - 1, Math.floor(Math.max(v1.x, Math.max(v2.x, v3.x))));
					int minY = (int)Math.max(0, Math.ceil(Math.min(v1.y, Math.min(v2.y, v3.y))));
					int maxY = (int)Math.min(img.getHeight() - 1, Math.floor(Math.max(v1.y, Math.max(v2.y, v3.y))));
					
					double triangleArea = (v1.y - v3.y) * (v2.x - v3.x) + (v2.y - v3.y) * (v3.x - v1.x);
					
					for (int y = minY; y <= maxY; y++)
					{
						for (int x = minX; x <= maxX; x++)
						{
							double b1 = ((y - v3.y) * (v2.x - v3.x) + (v2.y - v3.y) * (v3.x - x)) / triangleArea;
							double b2 = ((y - v1.y) * (v3.x - v1.x) + (v3.y - v1.y) * (v1.x - x)) / triangleArea;
							double b3 = ((y - v2.y) * (v1.x - v2.x) + (v1.y - v2.y) * (v2.x - x)) / triangleArea;
							if (b1 >= 0 && b1 <= 1 && b2 >= 0 && b2 <= 1 && b3 >= 0 && b3 <= 1) {
								img.setRGB(x, y, t.color.getRGB());
							}
						}
					}
				}
				g2.drawImage(img, 0, 0, null);
			}
		};
		pane.add(renderPanel, BorderLayout.CENTER);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
