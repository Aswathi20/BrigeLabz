package controlflowlevel2;
import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kilograms:");
		double weight = scanner.nextDouble();
		System.out.println("Enter height in centimeters:");
		double heightCm = scanner.nextDouble();
		double heightMeters = heightCm / 100;
		double bmi = weight / (heightMeters * heightMeters);
		String status;
		if (bmi <= 18.4) {
			status = "Underweight";
		} else if (bmi <= 24.9) {
			status = "Normal";
		} else if (bmi <= 39.9) {
			status = "Overweight";
		} else {
			status = "Obese";
		}

		System.out.println("Your BMI is: " + bmi);
		System.out.println("Weight Status: " + status);
	}
}

