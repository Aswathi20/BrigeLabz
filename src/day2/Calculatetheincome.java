package day2;
import java.util.Scanner;
public class Calculatetheincome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the salary ");
		
		double salary=sc.nextDouble();
		System.out.println("enter the bonus");
		
		double bonus=sc.nextDouble();
		
		double income=salary+bonus;
		
		System.out.println("The salary is INR"+salary+"and bonus is INR "+bonus+" Hence Total Income is INR"+income);
		
		
		

	}

}
