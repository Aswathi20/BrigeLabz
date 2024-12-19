package controlflow;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number<0) {
			System.out.println("its the negative number");
		}else if(number==0) {
			System.out.println("the number is zero ");
		}else {
			int factorial=1;
			int i=1;
			while(i<=number) {
				factorial=factorial*i;
				i++;
			}
			System.out.println("the factorial of number"+number+" the factorial of the number"+factorial);
		}
		
	}

}
