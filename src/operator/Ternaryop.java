package operator;
import java.util.Scanner;
public class Ternaryop {
	 public static void minOfTwoNumbers() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two numbers:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int min = (num1 < num2) ? num1 : num2;
	        System.out.println("Minimum number: " + min);
	    }

	public static void main(String[] args) {
		minOfTwoNumbers();
		
	}

}
