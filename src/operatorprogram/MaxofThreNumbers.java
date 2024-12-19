package operatorprogram;
import java.util.Scanner;
public class MaxofThreNumbers {
	public static void maxOfThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Maximum number: " + max);
    }
	
	
	
	public static void main(String[] args) {
		
		maxOfThreeNumbers();
	}

}
