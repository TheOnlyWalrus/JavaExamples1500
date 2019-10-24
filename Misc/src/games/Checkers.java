package games;

class Board
{
	char[][] board = {
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
			};
	
	public Board()
	{
		/* Setting up the board */
		for (int row = 0; row < 8; row++)
		{
			for (int col = 0; col < 8; col++)
			{
				if (row < 3)
				{
					if (row % 2 == 0)
					{
						if (col % 2 == 0)
						{
							this.board[row][col] = 'B';
						}
					}
					else if (row % 2 != 0)
					{
						if (col % 2 != 0)
						{
							this.board[row][col] = 'B';
						}
					}
				}
				else if (row > 4)
				{
					if (row % 2 == 0)
					{
						if (col % 2 == 0)
						{
							this.board[row][col] = 'R';
						}
					}
					else if (row % 2 != 0)
					{
						if (col % 2 != 0)
						{
							this.board[row][col] = 'R';
						}
					}
				}
			}
		}
	}
	
	public void parseBoard()
	{
		for (int row = 0; row < 8; row++)
		{
			for (int col = 0; col < 8; col++)
			{
				System.out.printf("%c ", this.board[row][col]);
			}
			
			System.out.println();
		}
	}
}

public class Checkers
{	
	public static void main(String[] args)
	{
		Board board = new Board();
		board.parseBoard();
	}
}
