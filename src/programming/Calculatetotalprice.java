package programming;

import java.util.Scanner;

public class Calculatetotalprice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the price ");
		
		int price=sc.nextInt();
		
	    System.out.println("enter the quantity of thing bought");
	    
	    int quantity=sc.nextInt();
	    
	    int totalpriceoftings=price*quantity;
	    
	    
	    System.out.println("The total purchase price is INR"+price +"if the quantity "+quantity+" and unit price is INR "+totalpriceoftings);
	    
		
	}

}
