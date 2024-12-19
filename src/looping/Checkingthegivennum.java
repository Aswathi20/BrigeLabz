package looping;
import java.util.Scanner;

public class Checkingthegivennum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number<0) {
			System.out.println("the negative number"+number);
			
		}else if(number>0){
			System.out.print("the positve number is"+ number);
			
		}else if(number==0) {
			System.out.println("the given number is"+number);
		}
		else {
			System.out.println("its not a number");
		}
		
	}

}
