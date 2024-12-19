package looping;
import java.util.Scanner;
public class Naturalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int naturalnumber=sc.nextInt();
		int sumofnatural=0;
		if(naturalnumber>=0) {
			sumofnatural=naturalnumber*(naturalnumber+1)/2;
			System.out.println("The sum of"+naturalnumber+"natural numbers is"+""+sumofnatural);

		}else {
			System.out.println("the number is not natural number"+naturalnumber);
		}
	}
}
