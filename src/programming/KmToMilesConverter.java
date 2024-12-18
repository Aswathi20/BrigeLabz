package programming;

import java.util.Scanner;
public class KmToMilesConverter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the kilometer");
		
		double km=scanner.nextDouble();
		
		double miles = km / 1.6;

        
        System.out.println(km + " kilometers is equal to " + miles + " miles.");


	}

}
