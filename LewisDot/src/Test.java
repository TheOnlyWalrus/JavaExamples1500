public class Test
{
	public static void main(String[] args)
	{
		Lewis2D lewis = new Lewis2D(new Element(1, 1, "H", "Hydrogen"), new Element(1, 1, "H", "Hydrogen"));
		lewis.generate();
	}
}
