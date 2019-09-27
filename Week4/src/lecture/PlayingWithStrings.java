package lecture;

public class PlayingWithStrings
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Use command line arguments");
			System.exit(0);
		}

		String argOne = args[0];

		System.out.println(argOne);

		System.out.println(argOne.toUpperCase());
		System.out.println(argOne.toLowerCase());

		System.out.printf("Finding oo %d\n", argOne.indexOf("oo"));

		String modified = argOne.replace("oo", "ee");

		System.out.printf("Replaced \"oo\" with \"ee\": %s\n", modified);

		String s1 = "This is some text";
		String s2 = "This is some text";
		/* Safe way of testing string equality */
		if (s1.equals(s2))
		{
			System.out.println("s1 == s2");
		}
		else
		{
			System.out.println("s1 != s2");
		}
	}
}
