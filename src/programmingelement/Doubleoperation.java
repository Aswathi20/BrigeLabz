package programmingelement;
import java.util.Scanner;
public class Doubleoperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double result1=a + b *c;
		double result2=a * b + c;
		double result3= c + a / b;
		double result4=a % b + c;
		System.out.println( "The results of Int Operations are "+result1+"," +result2+"," +result3+" "+"and"+ result4);
	}
}
