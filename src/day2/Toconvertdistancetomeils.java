package day2;
import java.util.Scanner;
public class Toconvertdistancetomeils {
	/*Rewrite the Sample Program 2 with user inputs
	Hint => 
	Create variables and take user inputs for name, fromCity, viaCity, toCity
	Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
	Create Variables and take time taken 
	Finally, print the result and try to understand operator precedence.
	I/P => fee, discountPrecent
	O/P => The results of Int Operations are ___, ___, and ___*/


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the from city");
		
		String fromcity=sc.nextLine();
		
		System.out.println("Enter the viacity");
		
		String viacity=sc.nextLine();
		
		System.out.println("Enter the tocity");
		
		String tocity=sc.nextLine();
		System.out.println("Enter the viacity distance");
		
		double distancecoverd=sc.nextDouble();
		
		System.out.println("enter the to city");
		double covereddistance=sc.nextDouble();
		
		System.out.println("enter the time taken");
		double timetaken=sc.nextDouble();
		
		//covert the distance to meils
		
		double totaldistance= distancecoverd+covereddistance;

		double averagetimetaken=totaldistance/timetaken;
		
		double adjusteddistsnce= totaldistance*1.60934;
		
		
		System.out.println("The distane cover viacity"+distancecoverd+"and the distance "
				+ "covered to city"+covereddistance+"total distance covered is"+totaldistance);
		
		
		
		
	}

}
