package looping;
import java.util.Scanner;
public class Smallestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int number1=sc.nextInt();
		System.out.println("Enter the number 2");
		int number2=sc.nextInt();
		System.out.println("Enter the number 3");
		int number3=sc.nextInt();

		if(number1<number2&&number1<number3) {
			System.out.println("number one is smallest"+number1);
		}else if(number2<number1&& number2<number1 ) {
			System.out.println("number two is smallest"+number2);


		}else {
			System.out.println("number three is smallest"+number3);
		}
	}
}
