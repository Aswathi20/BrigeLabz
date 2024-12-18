package operator;
import java.util.Scanner;
public class Equality {
	public static void equalityCheck() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two strings:");
	        String str1 = scanner.next();
	        String str2 = scanner.next();
	        boolean isEqual = str1.equals(str2);
	        System.out.println("Strings are " + (isEqual ? "equal" : "not equal"));
	    }

	    
	
	public static void main(String[] args) {
		
		equalityCheck() ;
	}

}
