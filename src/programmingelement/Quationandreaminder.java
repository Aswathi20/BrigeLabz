package programmingelement;

import java.util.Scanner;
public class Quationandreaminder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number1");
		int number1=sc.nextInt();
		System.out.print("entyer the number 2");
		int number2=sc.nextInt();
		int  quotient=number1/number2;
		int remainder=number1%number2;

		System.out.println("The Quotient is"+ quotient+" and Reminder is "+ remainder+"of two number"+number1+" and" +number2);
	}
}
