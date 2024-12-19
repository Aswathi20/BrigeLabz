package controlflow;
import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int originalnum=number;
		int sum=0;
		while(number!=0) {
			int reminder=number%10;
			sum+=reminder*reminder*reminder;
			number/=10;
			}
		if(sum==originalnum) {
			System.out.println("the number is amstrong number");
		}
		else {
			System.out.println("the number is not an amstrong number");
		}
		}
}
