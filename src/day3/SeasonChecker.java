package day3;

public class SeasonChecker {
    public static void main(String[] args) {
        // Ensure exactly two arguments are provided (month and day)
        if (args.length != 2) {
            System.out.println("Please provide two integer arguments: month and day.");
            return;
        }

        // Parse the command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the given date falls in the Spring Season
        boolean isSpring = false;

        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30) ||    // April 1 to April 30
            (month == 5 && day >= 1 && day <= 31) ||    // May 1 to May 31
            (month == 6 && day >= 1 && day <= 20)) {    // June 1 to June 20
            isSpring = true;
        }

        // Output the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
