package looping;
import java.util.Scanner;
public class Divsibleby5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%5==0) {
			System.out.print("the number is divisible by 5");

		}else {
			System.out.print("the number is number is not divisible by 5");
		}
	}
}
