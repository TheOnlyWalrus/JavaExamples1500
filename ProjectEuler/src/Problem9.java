public class Problem9
{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		int product;
		
		for (a = 1; a < 1000; a++)
		{
			for (b = 1; b < 1000; b++)
			{
				for (c = 1; c < 1000; c++)
				{
					int a2 = (int)Math.pow(a, 2);
					int b2 = (int)Math.pow(b, 2);
					int c2 = (int)Math.pow(c, 2);
					
					if (a2 + b2 == c2)
					{
						if (a + b + c == 1000)
						{
							product = a * b * c;
							System.out.printf("Triplet:\n	a = %d\n	b = %d\n	c = %d\nProduct: %d\n", a, b, c, product);
							System.exit(0);
						}
					}
				}
			}
		}
	}
}
