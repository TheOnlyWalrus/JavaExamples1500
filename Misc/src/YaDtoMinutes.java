import java.util.Scanner;

public class YaDtoMinutes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int years = scanner.nextInt();
		int days = scanner.nextInt();
		
		scanner.close();
		
		long minutes = (long)years * (long)525600 + (long)days * (long)1440;
		
		System.out.printf("%d years and %d days in minutes is %d\n", years, days, minutes);
	}

}
