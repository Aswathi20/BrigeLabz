package programmingelements;
import java.util.Scanner;
public class Convertinghightincm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("height in centimer");
		double heigthincm=sc.nextDouble();
		double totalInches = heigthincm / 2.54; // Convert cm to inches
		int feet = (int) (totalInches / 12); // Convert inches to feet
		double remainingInches = totalInches % 12;
		System.out.println("Your Height in cm is"+heigthincm +" "+ "while in feet is" + " "+feet+"and inches is"+totalInches);
	}
}

