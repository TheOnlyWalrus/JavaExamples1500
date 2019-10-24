package problems_001_050;

public class Problem006
{
	public static void main(String[] args)
	{
		int sum = 0;
		int sqSum;
		int sumOfSq = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
			sumOfSq += (int)Math.pow(i, 2);
		}
		
		sqSum = (int)Math.pow(sum, 2);
		
		System.out.printf("sqSum: %d\nsumOfSq: %d\nDiff: %d", sqSum, sumOfSq, sqSum - sumOfSq);
	}
}
