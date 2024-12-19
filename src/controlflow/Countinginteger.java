package controlflow;
import java.util.Scanner;
public class Countinginteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number");
		int number=sc.nextInt();
		int count=0;
		while(number!=0) {
			int remider=number%10;
			count++;
			number/=10;
		}
		System.out.println("the count of the digit"+count);		

	}

}
