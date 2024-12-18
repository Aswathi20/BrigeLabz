package operator;
import java.util.Scanner;
public class DivisibilityCheck {
	public static void divisibilityCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        boolean isDivisible = (num % 5 == 0 && num % 7 == 0);
        System.out.println(num + " is " + (isDivisible ? "divisible by both 5 and 7" : "not divisible by both 5 and 7"));
    }


	public static void main(String[] args) {
		divisibilityCheck();
		
	}

}
