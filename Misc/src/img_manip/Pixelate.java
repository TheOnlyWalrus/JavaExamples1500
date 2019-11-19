package img_manip;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pixelate
{
	private static BufferedImage img;
	private int pixelSize;
	
	public Pixelate(File image, int pixelSize)
	{
		this.pixelSize = pixelSize;
		
		try
		{
			img = ImageIO.read(image);
		}
		catch (IOException e)
		{
			System.out.println("Could not read image " + image.getName());
			System.exit(1);
		}
	}
	
	public void pixelate(String out, String extension)
	{
		Raster src = img.getData();
		WritableRaster dest = src.createCompatibleWritableRaster();
		
		for (int y = 0; y < src.getHeight(); y += this.pixelSize)
		{
			for (int x = 0; x < src.getWidth(); x += this.pixelSize)
			{
				double[] pixel = new double[4];
				pixel = src.getPixel(x, y, pixel);
				
				for (int yd = y; (yd < y + this.pixelSize) && (yd < dest.getHeight()); yd++)
				{
					for (int xd = x; (xd < x + this.pixelSize) && (xd < dest.getWidth()); xd++)
					{
						dest.setPixel(xd, yd, pixel);
					}
				}
			}
		}
		
		img.setData(dest);
		
		try
		{
			ImageIO.write(img, extension, new File(out + "." + extension));
		}
		catch (IOException e)
		{
			System.out.println("Could not write to " + out + "." + extension);
			System.exit(1);
		}
	}
}
