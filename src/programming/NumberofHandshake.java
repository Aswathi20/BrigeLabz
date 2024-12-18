package programming;
import java.util.Scanner;

public class NumberofHandshake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		int numberOfStudents=sc.nextInt();
		
		int findnumberofhandshake= (numberOfStudents* (numberOfStudents - 1)) / 2 ;
		
		System.out.println("the number of handshake"+" "+findnumberofhandshake);
		
		

	}

}
