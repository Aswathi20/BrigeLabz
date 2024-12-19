package operatorprogram;
import java.util.Scanner;
public class Oddeven {
	public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        boolean isEven = (num & 1) == 0;
        System.out.println(num + " is " + (isEven ? "even" : "odd"));
    }
	
	
	public static void main(String[] args) {
		
		oddOrEven();
	}

}
