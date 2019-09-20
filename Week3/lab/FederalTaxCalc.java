import java.util.Scanner;

public class FederalTaxCalc
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		while (input.hasNextLine() && input.hasNextInt())
		{
			int id = input.nextInt();
			int status = input.nextInt();
			double income = input.nextDouble();

			double cap1, cap2, cap3, cap4, cap5, cap6;
			double max1, max2, max3, max4, max5, max6;
			int bracket;
			double tax;
			double rate1 = 0.1;
			double rate2 = 0.15;
			double rate3 = 0.25;
			double rate4 = 0.28;
			double rate5 = 0.33;
			double rate6 = 0.35;
			double rate7 = 0.396;

			switch (status)
			{
				case 0:
					cap1 = 9275;
					cap2 = 37650;
					cap3 = 91150;
					cap4 = 190150;
					cap5 = 413350;
					cap6 = 415050;

					max1 = 927.50;
					max2 = 5183.75;
					max3 = 18558.75;
					max4 = 46278.75;
					max5 = 119934.75;
					max6 = 120529.75;
					break;
				case 1:
					cap1 = 18550;
					cap2 = 75300;
					cap3 = 151900;
					cap4 = 231450;
					cap5 = 413350;
					cap6 = 466950;

					max1 = 1855;
					max2 = 10367.50;
					max3 = 29517.50;
					max4 = 51791.50;
					max5 = 111818.50;
					max6 = 130578.50;
					break;
				case 2:
					cap1 = 9275;
					cap2 = 37650;
					cap3 = 75950;
					cap4 = 115725;
					cap5 = 206675;
					cap6 = 233475;

					max1 = 927.50;
					max2 = 5183.75;
					max3 = 14758.75;
					max4 = 25895.75;
					max5 = 55909.25;
					max6 = 65289.25;
					break;
				case 3:
					cap1 = 13250;
					cap2 = 50400;
					cap3 = 130150;
					cap4 = 210800;
					cap5 = 413350;
					cap6 = 441000;

					max1 = 1325;
					max2 = 6897.50;
					max3 = 26835;
					max4 = 49417;
					max5 = 116258.50;
					max6 = 125936;
					break;
				default:
					cap1 = cap2 = cap3 = cap4 = cap5 = cap6 = 0;
					max1 = max2 = max3 = max4 = max5 = max6 = 0;
					System.out.printf("Could not calculate	values for status %d\n", status);
					System.exit(0);
			}
			/* Determining Bracket by Income and Calculating Tax */
			if (income < cap1)
			{
				bracket = 1;
				tax = rate1 * income;
			}
			else if (income < cap2)
			{
				bracket = 2;
				tax = max1 + rate2 * (income - cap1);
			}
			else if (income < cap3)
			{
				bracket = 3;
				tax = max2 + rate3 * (income - cap2);
			}
			else if (income < cap4)
			{
				bracket = 4;
				tax = max3 + rate4 * (income - cap3);
			}
			else if (income < cap5)
			{
				bracket = 5;
				tax = max4 + rate5 * (income - cap4);
			}
			else if (income < cap6)
			{
				bracket = 6;
				tax = max5 + rate6 * (income - cap5);
			}
			else
			{
				bracket = 7;
				tax = max6 + rate7 * (income - cap6);
			}

			/* Printing out taxes due */
			System.out.printf("%8d %d %10.2f\n", id, bracket, tax);
		}
	}
}
