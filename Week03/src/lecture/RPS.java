package lecture;

import java.util.Scanner;

public class RPS
{
	public static void main(String[] args)
	{
		/* Create scanner and constants */
		Scanner scanner = new Scanner(System.in);
		int ROCK = 0;
		int PAPER = 1;
		int SCISSORS = 2;

		/* Getting input */
		System.out.print("Rock (0), Paper (1), or Scissors (2)? ");
		int user = scanner.nextInt();
		
		scanner.close();

		/* Checking input */
		if (user > 2 || user < 0)
		{
			System.out.println("You entered an invalid value");
			System.exit(0);
		}

		/* Create random computer choice */
		int computer = (int)(Math.random() * 3);

		if (user == ROCK)
		{ /* User chose rock */
			if (computer == SCISSORS)
			{ /* Computer is scissors */
				System.out.println("Computer chose scissors! You win!");
			}
			else if (computer == PAPER)
			{ /* Computer is paper */
				System.out.println("Computer chose paper! You lose!");
			}
			else
			{ /* Computer is rock */
				System.out.println("Computer chose rock! You tied!");
			}
		}
		else if (user == PAPER)
		{ /* User chose paper */
			if (computer == ROCK)
			{ /* Computer is rock */
				System.out.println("Computer chose rock! You win!");
			}
			else if (computer == SCISSORS)
			{ /* Computer is scissors */
				System.out.println("Computer chose scissors! You lose!");
			}
			else
			{ /* Computer is paper */
				System.out.println("Computer chose paper! You tied!");
			}
		}
		else
		{ /* User chose scissors */
			if (computer == PAPER)
			{ /* Computer is paper */
				System.out.println("Computer chose paper! You win!");
			}
			else if (computer == ROCK)
			{ /* Computer is rock */
				System.out.println("Computer chose rock! You lose!");
			}
			else
			{ /* Computer is scissors */
				System.out.println("Computer chose scissors! You tied!");
			}
		}
	}
}
