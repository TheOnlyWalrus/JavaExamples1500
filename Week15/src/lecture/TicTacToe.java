package lecture;

import java.util.Scanner;

public class TicTacToe
{
	static int n = 3;
	static int[][] board = {
			{-1, 0, 1},
			{0, -1, -1},
			{0, 0, -1}
	};
	
	public static int movesRemaining()
	{
		int sum = 0;
		
		for (int x = 0; x < n; x++)
		{
			for (int y = 0; y < n; y++)
			{
				if (board[x][y] == 0)
				{
					sum += 1;
				}
			}
		}
		
		return sum;
	}

	public static int winner()
	{
		for (int x = 0; x < n; x++)
		{
			int sum = 0;
			for (int y = 0; y < n; y++)
			{
				sum += board[x][y];
			}
			
			if (sum == n)
			{
				return 1;
			}
			else if (sum == -n)
			{
				return -1;
			}
		}
		
		for (int y = 0; y < n; y++)
		{
			int sum = 0;
			for (int x = 0; x < n; x++)
			{
				sum += board[x][y];
			}
			
			if (sum == n)
			{
				return 1;
			}
			else if (sum == -n)
			{
				return -1;
			}
		}
		
		int sumF = 0;
		int sumB = 0;
		for (int i = 0; i < n; i++)
		{
			sumF += board[i][i];
			sumB += board[i][n - i - 1];
		}
		
		if (sumF == n || sumB == n)
		{
			return 1;
		}
		else if (sumF == -n || sumB == -n)
		{
			return -1;
		}
		
		return 0;
	}
	
	public static boolean isValid(int x, int y)
	{
		if (x > n - 1 || y > n - 1 || x < 0 || y < 0)
		{
			System.out.println("Out of bounds");
			return false;
		}
		
		if (board[x][y] != 0)
		{
			System.out.println("Space taken");
			return false;
		}
		
		return true;
	}
	
	public static char playerName(int value)
	{
		if (value == -1)
		{
			return 'X';
		}
		else if (value == 1)
		{
			return 'O';
		}
		return ' ';
	}
	
	public static void printBoard()
	{
		for (int i = 0; i < n * 2 + 1; i++)
		{
			System.out.print("-");
		}
		
		System.out.println();
		
		for (int x = 0; x < n; x++)
		{
			System.out.print("|");
			for (int y = 0; y < n; y++)
			{
				System.out.print(playerName(board[x][y]));
				System.out.print("|");
			}
			System.out.println();
			for (int i = 0; i < n * 2 + 1; i++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public static void setup()
	{
		for (int x = 0; x < board.length; x++)
		{
			for (int y = 0; y < board.length; y++)
			{
				board[x][y] = 0;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		setup();
		int playerIndex = 1;
		int x;
		int y;
		
		do
		{
			printBoard();
			do
			{
				System.out.printf("Player %c Move\n", playerName(playerIndex));
				
				x = scanner.nextInt();
				y = scanner.nextInt();
			} while (!isValid(x, y));
			
			board[x][y] = playerIndex;
			playerIndex *= -1;
		} while (movesRemaining() != 0 && winner() == 0);
		
		printBoard();
		
		if (winner() != 0)
		{
			System.out.printf("Player %c wins!", playerName(playerIndex));
		}
		else
		{
			System.out.println("Nobody won!");
		}
		
		scanner.close();
	}
}
