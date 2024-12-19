package operatorprogram;
import java.util.Scanner;
public class Passorfail {
	public static void passOrFail() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks (out of 100):");
		int marks = scanner.nextInt();
		String result = (marks >= 40) ? "Pass" : "Fail";
		System.out.println("Result: " + result);
	}
	public static void main(String[] args) {
		passOrFail();
	}
}
