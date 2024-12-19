package operatorprogram;
import java.util.Scanner;
public class Mutiplicationtable{
	public static void multiplicationTable() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for the multiplication table:");
		int number = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}


	}
	public static void main(String args[]) {
		multiplicationTable();
	}
}
