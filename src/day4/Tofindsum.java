package day4;
import java.util.Scanner;

public class Tofindsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int sum=0;
		while(true) {
			System.out.println("enter the number");
			int number=sc.nextInt();
			if(number<=0) {
				break;
				
			}
			sum+=number;
			
		}
		
		System.out.println("the sum of number is"+sum);
		
	}

}
