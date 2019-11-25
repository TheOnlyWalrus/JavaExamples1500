package grass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grass
{
	public static void main(String[] args)
	{
		if (args.length > 1)
		{
			System.out.printf("Usage: %s [file]", args[0]);
			System.exit(1);
		}
		
		if (args.length == 1)
		{
			// Run file
		}
		else
		{
			prompt();
		}
	}
	
	private static void prompt()
	{
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		
		while (!quit)
		{
			System.out.print(">> ");
			String in = scanner.nextLine();
			List<Token> tokens = new ArrayList<>();
			
			if (in == "quit")
			{
				quit = true;
			}
			
			for (int index = 0; index < in.length();)
			{
				char character = in.charAt(index);
				
				switch (character)
				{
					case '+':
						break;
					case '-':
						break;
					case '*':
						break;
					case '/':
						break;
					case '^':
						// Pow
						break;
					case '#':
						// Comment character
						break;
					case '"': {
						index++;
						String res = "\"";
						while (in.charAt(index) != '"')
						{
							res += in.charAt(index);
							index++;
						}
						res += "\"";
						tokens.add(new Token(res, TokenType.STRING));
						break;
					}
					case ' ':
					case '\t':
					case '\r':
						break;
					default:
						tokens.add(new Token(character, TokenType.STRING));
						// AlphaNum, Num
						break;
				}
				
				index++;
			}
			
			for (Token tok : tokens)
			{
				System.out.println(tok.value + " " + tok.type);
			}
		}
		
		scanner.close();
	}
}
