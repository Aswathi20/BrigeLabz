package controlflowlevel2;
import java.util.Scanner;
public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		boolean isPrime = true;

		if (num > 1) {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(num + " is a Prime Number.");
			} else {
				System.out.println(num + " is not a Prime Number.");
			}
		} else {
			System.out.println("Number should be greater than 1 to be a Prime Number.");
		}
	}
}
