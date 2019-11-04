package lecture;

public class FibonacciArray {
	public static void main(String[] args)
	{
		int n = 20;
		int fib[] = new int[n];
		
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i = 2; i < n; i++)
		{
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		for (int num : fib)
		{
			System.out.println(num);
		}
	}
}
