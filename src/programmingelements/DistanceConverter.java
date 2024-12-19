package programmingelements;
import java.util.Scanner;
public class DistanceConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the distance in feet: ");
		double distanceInFeet = scanner.nextDouble();
		double feetInYard = 3;  
		double yardsInMile = 1760;  
		double distanceInYards = distanceInFeet / feetInYard;
		double distanceInMiles = distanceInYards / yardsInMile;
		System.out.println("Your distance in feet"+distanceInFeet+"the distance in yards" +distanceInYards+"distance in mailes"+distanceInMiles);        
	}
}

