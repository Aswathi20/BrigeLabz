package controlflow;
import java.util.Scanner;
public class Sumofnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		double number=sc.nextDouble();
		double total=0.0;

		if(number!=0) {
			total+=number;
			System.out.println(total);

		}
		else {
			System.out.println("the value entered is zero");
		}
	}
}
