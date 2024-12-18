package day4;
import java.util.Scanner;
public class Naturalnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int naturalnum=sc.nextInt();
		
		if(naturalnum<=0) {
			System.out.println("the given number is not an natural number");
			
		}else {
			int sumofnatural=naturalnum *(naturalnum +1)/2;
			
			int sumloop=0;
			for(int i=0;i<=naturalnum;i++) {
				sumloop+=i;
				
			}
			System.out.println("the sum of natural number using loops"+" "+sumloop);
			System.out.println("the sum of natural number using formula"+" "+sumofnatural);
		}
	}

}
