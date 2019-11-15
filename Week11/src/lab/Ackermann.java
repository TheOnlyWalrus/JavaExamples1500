package lab;

import java.math.BigInteger;
import java.util.ArrayDeque;

public class Ackermann
{
	/*
	 * 			 { n + 1				 ; m = 0
	 * A(m, n) = { A(m - 1, 1)			 ; m > 0 and n = 0
	 * 			 { A(m - 1, A(m, n - 1)) ; m > 0 and n > 0
	 */
	
	public static long count = 0;
	public static long maxDepth = 0;
	
	public static int A(int m, int n, int depth)
	{
		count++;
		
		if (depth > maxDepth)
		{
			maxDepth = depth;
		}
		
		if (m == 0)
		{
			return n + 1;
		}
		else if (n == 0)
		{
			maxDepth += 1;
			return A(m - 1, 1, depth + 1);
		}
		else
		{
			maxDepth += 2;
			return A(m - 1, A(m, n - 1, depth + 1), depth + 1);
		}
	}
	
	public static long A(long m, long n)
	{
		count++;
		
		if (m == 0)
		{
			return n + 1;
		}
		else if (n == 0)
		{
			return A(m - 1, 1);
		}
		else
		{
			return A(m - 1, A(m, n - 1));
		}
	}
	
	public static BigInteger A(BigInteger m, BigInteger n)
	{
		count++;
		
		if (m.compareTo(BigInteger.ZERO) == 0)
		{
			return n.add(BigInteger.ONE);
		}
		else if (n.compareTo(BigInteger.ZERO) == 0)
		{
			return A(m.subtract(BigInteger.ONE), BigInteger.ONE);
		}
		else
		{
			return A(m.subtract(BigInteger.ONE), A(m, n.subtract(BigInteger.ONE)));
		}
	}
	
	public static BigInteger A_nr(BigInteger m, BigInteger n, boolean printStack)
	{
		ArrayDeque<BigInteger> stack = new ArrayDeque<BigInteger>();
		
		stack.push(m);
		stack.push(n);
		
		while (stack.size() > 1)
		{
			if (printStack)
			{
				System.out.println(stack);
			}
			
			n = stack.pop();
			m = stack.pop();
			
			count++;
			
			if (m.compareTo(BigInteger.ZERO) == 0)
			{
				stack.push(n.add(BigInteger.ONE));
			}
			else if (n.compareTo(BigInteger.ZERO) == 0)
			{
				stack.push(m.subtract(BigInteger.ONE));
				stack.push(BigInteger.ONE);
			}
			else
			{
				stack.push(m.subtract(BigInteger.ONE));
				stack.push(m);
				stack.push(n.subtract(BigInteger.ONE));
			}
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args)
	{
		int m = 1;
		int n = 1;
		
		int Ar = A(m, n, 0);
		
		BigInteger mbi = new BigInteger("" + m);
		BigInteger nbi = new BigInteger("" + n);
		
		count = 0;
		
		BigInteger Anr = A_nr(mbi, nbi, false);
		
		System.out.println("Recusive A = " + Ar);
		System.out.println("Non-recursive A = " + Anr);
		System.out.println("Count = " + count);
		System.out.println("maxDepth = " + maxDepth);
	}
}
