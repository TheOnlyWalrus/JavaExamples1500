import chemistry.CommonCompounds;
import math.ComplexNumber;

public class TestPackages
{
	public static void main(String[] args)
	{	
		System.out.println(new CommonCompounds.Water(1).getCharge());
		
		System.out.println(new ComplexNumber(2, 4).compareTo(new ComplexNumber(2, 2)) == 0);
	}
}
