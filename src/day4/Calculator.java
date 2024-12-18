package day4;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number:");
        double first = sc.nextDouble(); // First number

        System.out.println("Enter the second number:");
        double second = sc.nextDouble(); 

        System.out.println("Enter the operator (+, -, *, /):");
        String op = sc.next(); 

        
        double result = 0; 
        boolean isValid = true; 

        switch (op) {
            case "+":
                result = first + second; // Addition
                break;
            case "-":
                result = first - second; // Subtraction
                break;
            case "*":
                result = first * second; // Multiplication
                break;
            case "/":
                if (second != 0) {
                    result = first / second; // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    isValid = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                isValid = false;
                break;
        }

        
        if (isValid) {
            System.out.println("The result is: " + result);
        }

        
    }
}
