package controlflow;


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.println("Enter the day:");
        int day = sc.nextInt();
        
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        
        // Applying the Zeller's Congruence formula
        int y0 = year - (14 - month) / 12;                  
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  
        int m0 = month + 12 * ((14 - month) / 12) - 2;      
        int d0 = (day + x + (31 * m0) / 12) % 7;      

        
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
