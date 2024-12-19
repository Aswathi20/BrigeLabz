package looping;
import java.util.Scanner;
public class Largestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value one");
		int number1=sc.nextInt();
		System.out.println("Enter the value two");
		int number2=sc.nextInt();
		System.out.println("Enter the value three");
		int number3=sc.nextInt();

		if(number1>number2&&number1>number3) {
			System.out.println("number one is largest"+number1);
		}else if(number2>number1&& number2>number1 ) {
			System.out.println("number two is largest"+number2);


		}else {
			System.out.println("number three is largest"+number3);
		}
	}
}
