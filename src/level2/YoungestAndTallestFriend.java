package level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter the age of Amar");
        int ageAmar = scanner.nextInt();
        System.out.println("Enter the height of Amar in cm");
        double heightAmar = scanner.nextDouble();

        System.out.println("Enter the age of Akbar:");
        int ageAkbar = scanner.nextInt();
        System.out.println("Enter the height of Akbar in cm");
        double heightAkbar = scanner.nextDouble();

        System.out.println("Enter the age of Anthony");
        int ageAnthony = scanner.nextInt();
        System.out.println("Enter the height of Anthony in cm");
        double heightAnthony = scanner.nextDouble();

       
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest;
        if (youngestAge == ageAmar) {
            youngest = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest;
        if (tallestHeight == heightAmar) {
            tallest = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

       
        System.out.println("The youngest friend is: " + youngest + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is: " + tallest + " with height " + tallestHeight + " cm.");

        
    }
}

