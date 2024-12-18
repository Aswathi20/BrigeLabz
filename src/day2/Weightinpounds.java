package day2;
import java.util.Scanner;


public class Weightinpounds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weigth");
		double weight=sc.nextInt();
		
		double convertedweigthpoundtokg=weight/2.2;
		
		System.out.println("The weight of the person in pound is"+ weight+ "and in kg is"+
		convertedweigthpoundtokg);
		
		

		
	}

}
