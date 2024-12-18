package programming;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double CM_TO_INCHES = 0.393701;
        final double SQUARE_CM_TO_SQUARE_INCH = 0.155;
        
        
        System.out.println("Enter the base of the triangle in centimeters:");
        double baseCm = sc.nextDouble();

        System.out.println("Enter the height of the triangle in centimeters:");
        double heightCm = sc.nextDouble();

        
        double areaCm2 = 0.5 * baseCm * heightCm;

       
        double areaInches2 = areaCm2 * SQUARE_CM_TO_SQUARE_INCH;

        
        double heightInches = heightCm * CM_TO_INCHES; 
        int heightFeet = (int) (heightInches / 12);   
        double remainingInches = heightInches % 12;   

    
	System.out.println("Your Height in cm is" +heightCm+" "+"while in feet is "+heightFeet+" "+ "and inches is"+heightInches );
     }
}

