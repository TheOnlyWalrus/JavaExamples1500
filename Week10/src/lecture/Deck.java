package lecture;

public class Deck
{	
	public static void shuffle(int[] deck, int nshuffles)
	{
		for (int i = 0; i < nshuffles; i++)
		{
			int c1 = (int)(Math.random() * deck.length);
			int c2 = (int)(Math.random() * deck.length);
			int temp = deck[c1];
			deck[c1] = deck[c2];
			deck[c2] = temp;
		}
	}
	
	public static void printDeck(int[] deck)
	{
		for (int i = 0; i < deck.length; i++)
		{
			System.out.print(deck[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void draw(int[] deck, int amount)
	{
		for (int i = 0; i < 5; i++)
		{
			int value = deck[i] % 13;
			int suit = deck[i] / 13;
			System.out.printf("Suit: %d | Value: %d\n", suit, value);
		}
	}
	
	public static void main(String[] args)
	{
		int n = 52;
		int[] deck = new int[n];
		for (int i = 0; i < n; i++)
		{
			deck[i] = i;
		}
		
		shuffle(deck, 2*n);
		draw(deck, 5);
	}
}
