package programmingelement;
import java.util.Scanner;
public class Swaptwonumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number 1");
		 int number1=sc.nextInt();
		 System.out.print("enter the number2");
		 int number2=sc.nextInt();
		 
		 
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("The swapped numbers are "+number1 +"and "+number2);
		
		 
		 
		 
		 

	}

}
