package lecture;

public class MontyHall
{
	public static void main(String[] args)
	{
		/*
		 * PSEUDOCODE
		 * 
		 * switch or stay
		 * 
		 * for x many times:
		 * 		int treasure = 3 * Math.random()
		 * 		int firstChoice = 0
		 * 		if (stay):
		 * 			if (card0 != treasure):
		 * 				cursed
		 * 		if (switch):
		 * 			if (treasure = 0):
		 * 				cursed
		 */
		
		int n = 100000;
		int curses = 0;
		boolean stay = false;
		
		for (int i = 0; i < n; i++)
		{
			int treasure = (int)(3 * Math.random());
			int firstChoice = 0;
			
			if (stay)
			{
				if (treasure != firstChoice)
				{
					curses++;
				}
			}
			else
			{
				if (treasure == firstChoice)
				{
					curses++;
				}
			}
		}
		
		System.out.printf("Tries: %d\nCurses: %d\n", n, curses);
	}
}
