package operatorprogram;
import java.util.Scanner;
public class shiftoperator {
	public static void bitwiseShift() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = scanner.nextInt();
		System.out.println("Multiplying by 2 using left shift: " + (num << 1));
		System.out.println("Dividing by 2 using right shift: " + (num >> 1));
	}
	public static void main(String[] args) {
		bitwiseShift();
	}
}
