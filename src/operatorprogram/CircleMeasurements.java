package operatorprogram;
import java.util.Scanner;
public class CircleMeasurements {
	public static void circleMeasurements() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
	}
	public static void main(String args[]) {
		circleMeasurements();
	}
}


