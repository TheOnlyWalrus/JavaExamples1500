package hw;

public class Problem6_7
{
	public static double futureInvestment(double investment, double intrest, int years)
	{
		// = investment, if years = 0 then just return investment
		double y = investment;
		double base = investment * (1 + intrest);
		for (int n = 1; n <= years; n++)
		{
			y = Math.pow(base, n);
			System.out.println(y);
		}
		
		return y;
	}
	
	public static void main(String[] args)
	{
		futureInvestment(1000, 0.09, 30);
	}
}
