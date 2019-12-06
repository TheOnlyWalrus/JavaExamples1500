package lab;

import java.awt.Color;

import worldofdata.javaplots.SimpleGrid;

public class GameOfLife
{
	public static int countNeighbors(int[][] cells, int x, int y)
	{
		int sum = 0;
		int nCols = cells.length;
		int nRows = cells[0].length;
		
		for (int i = -1; i < 2; i++)
		{
			for (int j = -1; j < 2; j++)
			{
				if (j != 0 || i != 0)
				{
					if (cells[(x + i + nCols) % nCols][(y + j + nRows) % nRows] > 0)
					{
						sum++;
					}
				}
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int n = 100;
		int[][] cells = new int[n][n];
		int[][] swap = new int[n][n];
		
		int cx = n / 2;
		int cy = n / 2;
		
		/* Blinker */
//		cells[cx - 1][cy] = 1;
//		cells[cx][cy] = 1;
//		cells[cx + 1][cy] = 1;
		
		/* Glider */
//		cells[cx - 1][cy - 1] = 1;
//		cells[cx][cy - 1] = 1;
//		cells[cx + 1][cy - 1] = 1;
//		cells[cx + 1][cy] = 1;
//		cells[cx][cy + 1] = 1;
		
		/* Blom */
		/* Left structure */
//		cells[cx - 1][cy - 1] = 1;
//		cells[cx - 2][cy - 1] = 1;
//		cells[cx - 2][cy] = 1;
//		cells[cx - 3][cy - 1] = 1;
//		cells[cx - 3][cy] = 1;
//		cells[cx - 4][cy - 1] = 1;
//		cells[cx - 5][cy - 2] = 1;
//		/* Right structure */
//		cells[cx + 6][cy - 2] = 1;
//		cells[cx + 6][cy - 1] = 1;
//		cells[cx + 6][cy] = 1;
//		cells[cx + 5][cy + 1] = 1;
//		cells[cx + 5][cy + 2] = 1;
//		cells[cx + 3][cy + 2] = 1;
		
		/* Default conway */
//		for (int i = 0; i < n; i++)
//		{
//			for (int j = 0; j < n; j++)
//			{
//				if (Math.random() < 0.25)
//				{
//					cells[i][j] = 1;
//				}
//			}
//		}
		
		SimpleGrid s = new SimpleGrid(601, 601);
		s.setBelowRange(Color.BLACK);
		s.setMinColor(Color.GREEN);
		s.setMaxColor(Color.WHITE);
		s.setCmapRange(1, 10);
		
		for (int i = 0; i < 100000; i++)
		{
			s.setData(cells);
			s.repaint();
			s.sleep(100);
			
			for (int x = 0; x < n; x++)
			{
				for (int y = 0; y < n; y++)
				{
					int count = countNeighbors(cells, x, y);
					
					if (cells[x][y] == 0)
					{
						if (count == 3)
						{
							swap[x][y] = 1;
						}
						else
						{
							swap[x][y] = 0;
						}
					}
					else
					{
						if (count == 2 || count == 3)
						{
							swap[x][y] = cells[x][y] + 1;
						}
						else
						{
							swap[x][y] = 0;
						}
					}
				}
			}
			
			for (int x = 0; x < n; x++)
			{
				for (int y = 0; y < n; y++)
				{
					cells[x][y] = swap[x][y];
				}
			}
			
			int[] coords = s.getClick();
			
			if (coords != null)
			{
				System.out.printf("Click (%d, %d)\n", coords[0], coords[1]);
			}
		}
	}
}
