package controlflow;
import java.util.Scanner;
public class Counter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int counter=sc.nextInt();

		if(counter>=1) {
			System.out.println(counter);
			counter--;
		}
		System.out.println("liftoff");
	}
}
