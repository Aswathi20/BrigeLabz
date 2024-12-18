package operator;
import java.util.Scanner;
public class Bitwise {
	public static void bitwiseOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
    }
	
	public static void main(String args[]) {
		bitwiseOperations();
	}
}
