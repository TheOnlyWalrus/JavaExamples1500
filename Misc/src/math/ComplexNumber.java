package math;

public class ComplexNumber implements Comparable<ComplexNumber>
{
	int real;
	int imaginary;
	
	public ComplexNumber(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber add(ComplexNumber number)
	{
		return new ComplexNumber(this.real + number.real, this.imaginary + number.imaginary);
	}
	
	public String toString()
	{
		return this.real + " + " + this.imaginary + "i";
	}
	
	@Override
	public int compareTo(ComplexNumber number) {
		/*
		 * Compares the real parts of the numbers
		 */
		if (this.real > number.real)
		{
			return 1;
		}
		else if (this.real < number.real)
		{
			return -1;
		}
		
		return 0;
	}
}
