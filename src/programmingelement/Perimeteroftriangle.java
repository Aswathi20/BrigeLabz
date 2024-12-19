package programmingelement;
import java.util.Scanner;
public class Perimeteroftriangle {

	public static void main(String[] args) {
		
		
		 final double targetDistance = 5000;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the side");
		 double side1=sc.nextDouble();
		 System.out.println("Enter the side two");
		 double side2=sc.nextDouble();
		 System.out.println("Enter the side three");
		 double side3=sc.nextDouble();
		 System.out.println("Enter the side four");
		 double side4=sc.nextDouble();
		 
		 double permeterofcircle=side1+side2+side3+side4;
		 
		 double roundscompleted=targetDistance/permeterofcircle;
		 
		 System.out.println("The permeter of circle is "+permeterofcircle+"the round "
		 		+ "completed by the player"+roundscompleted);
		 
		 
		 
		 
		 
		 

	}

}
