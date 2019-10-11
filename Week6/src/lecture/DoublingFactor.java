package lecture;

public class DoublingFactor
{
	public static void main(String[] args)
	{
		double balance = 100;
		double winChance = 16.0/34.0;
		double baseBet = 1;
		double doublingFactor = 2;
		double payoutFactor = 1;
		double loss = 0;
		double bet = 0;
		double goalBalance = 150.0;
		int iterations = 0;
		int losses = 0;
		int iMax = 10000000;
		
		while (balance > 0 && iterations < iMax && balance < goalBalance)
		{
			bet = baseBet + doublingFactor * loss;
			if (bet > balance)
			{
				bet = balance;
			}
			if (Math.random() < winChance)
			{
				balance += bet * payoutFactor;
				loss = 0;
			}
			else
			{
				balance -= bet;
				loss += bet;
				losses += 1;
			}
			
			iterations += 1;
		}
		
		System.out.printf("Balance: %.1f\nLoss: %.1f\nLosses: %d\nBet: %.1f\nIterations: %d\n", balance, loss, losses, bet, iterations);
	}
}
