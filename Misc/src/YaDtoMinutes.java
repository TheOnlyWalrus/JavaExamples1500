import java.util.Scanner;

public class YaDtoMinutes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int years = scanner.nextInt();
		int days = scanner.nextInt();
		
		scanner.close();
		
		int minutes = years * 525600 + days * 1440;
		
		System.out.printf("%d years and %d days in minutes is %d\n", years, days, minutes);
	}

}
