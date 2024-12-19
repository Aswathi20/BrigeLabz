package programmingelement;
import java.util.Scanner;
public class Smipleintrest {

	public static void main(String[] args) {
		/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___*/

		Scanner sc=new Scanner(System.in);

		System.out.print("enter the principal");

		double Principal=sc.nextDouble();
		System.out.println("Enter the rate");
		double rate=sc.nextDouble();
		System.out.println("Enter time");
		double time=sc.nextDouble();

		double SimpleInteret=Principal*rate/time;

		System.out.println("The Simple Interest is"+SimpleInteret+ "for Principal"+ Principal
				+" Rate of Interest"+rate +"and Time"+time);
	}
}
