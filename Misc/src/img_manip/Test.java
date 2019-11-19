package img_manip;

import java.io.File;

public class Test
{
	public static void main(String[] args)
	{
		Pixelate img = new Pixelate(new File("/Users/alexanderjones/Dropbox/Programming1500/Misc/src/img_manip/cat.png"), 5);
		img.pixelate("/Users/alexanderjones/Dropbox/Programming1500/Misc/src/img_manip/pixel_cat", "png");
	}
}
