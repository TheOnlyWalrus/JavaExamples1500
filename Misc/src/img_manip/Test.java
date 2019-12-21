package img_manip;

import java.io.File;

public class Test
{
	public static void main(String[] args)
	{
		Pixelate img = new Pixelate(new File("src/img_manip/cat.png"), 1);
		img.pixelate("src/img_manip/pixel_cat", "png");
	}
}
