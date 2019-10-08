package lecture;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int f1 = 1;
		int f2 = 1;
		int fib = f1;
		
		while (fib < 50)
		{
			System.out.println(fib);
			
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
		}
	}
}
