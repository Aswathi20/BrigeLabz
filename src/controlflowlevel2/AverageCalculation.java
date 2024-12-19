package controlflowlevel2;
import java.util.Scanner;
public class AverageCalculation {

		public static void averageCalculation() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter five integers:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();
	        int num4 = scanner.nextInt();
	        int num5 = scanner.nextInt();
	        double average = (num1 + num2 + num3 + num4 + num5) / 5.0;
	        System.out.println("Average: " + average);
	    }
	
	public static void main(String[] args) {
		averageCalculation();
		
}
	}
