package operator;

import java.util.Scanner;

public class OperatorPrograms {

    
    public static void additionAndSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
    }

public static void main(String args[]) {
	
	additionAndSubtraction();
}
}