package level2;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) { // Corrected to i <= number for all factors including the number itself.
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
