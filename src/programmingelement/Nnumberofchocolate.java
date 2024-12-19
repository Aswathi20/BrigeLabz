package programmingelement;
import java.util.Scanner;

public class Nnumberofchocolate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of chocolate ");
		int numberOfchocolates =sc.nextInt();
		System.out.println("enter the number of number of student");
		int numberofstudent=sc.nextInt();
		
		int numberofchcolateeachget=numberOfchocolates/numberofstudent;
		
		int numberofchcolate_remaining=numberOfchocolates%numberofstudent;
		
		System.out.println("Enter the number of chocolate each student is having"+numberofchcolateeachget+"the"
				+ " number of chocloate remaining"+numberofchcolate_remaining);
		
		

	}

}
