import java.util.Scanner;

import org.apache.commons.text.StringEscapeUtils;

public class JGrass
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		do
		{
			String built = "";
			String in = input.nextLine();
			for (int i = 0; i < in.length(); i++)
			{
				switch (in.charAt(i))
				{
					case '.':
						if (i + 1 < in.length() && in.charAt(++i) == '"')
						{
							i++;
							while (in.charAt(i) != '"')
							{
								built += in.charAt(i);
								i++;
							}
						}
						
						if (built != "")
						{
							System.out.println(StringEscapeUtils.unescapeJava(built));
						}
						
						break;
					case '-':
						built = "";
						break;
					case '"':
						i++;
						
						if (built != "")
						{
							built = "";
						}
						
						while (i < in.length() && (in.charAt(i) != '"' || (i + 1 < in.length() && in.charAt(i) == '\\')))
						{
							built += in.charAt(i);
							
							if (i + 1 < in.length() && in.charAt(i) == '\\')
							{
								built += in.charAt(++i);
							}
							
							i++;
						}
						break;
				}
			}
		} while (input.hasNextLine());
		
		input.close();
	}
}
