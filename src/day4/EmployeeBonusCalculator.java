package day4;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

       
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // Calculate 5% bonus
            System.out.println("The employee is eligible for a bonus.");
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

       
    }
}

