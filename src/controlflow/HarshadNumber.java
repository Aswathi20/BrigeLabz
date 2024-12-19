package controlflow;
import java.util.Scanner;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();

		int sum=0;

		while(number!=0) {
			int reminder=number%10;
			sum+=reminder;
			number/=10;


		}
		if(number/sum==0) {
			System.out.print("the given number is hashed number");

		}else {
			System.out.println("the given number is not hased number");
		}
	}
}
