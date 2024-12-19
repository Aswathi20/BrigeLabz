package looping;
import java.util.Scanner;
public class springSeason{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int month=sc.nextInt();
		System.out.println("Enter the day");
		int day=sc.nextInt();

		if((month==3 && day>20)||(month>=3&& month<=6)||(day>20&&day<31)) {
			System.out.println("its the spring season");
		}
		else {
			System.out.print("its not a spring seanson");
		}
	}
}
