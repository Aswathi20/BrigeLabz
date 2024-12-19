package programmingelements;
import java.util.Scanner;
public class UniversityDiscount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fee");
		double fee=sc.nextDouble();
		System.out.println("enter the discounted percent");
		double discountedpercent=sc.nextDouble();
		double discountassigned=(fee*discountedpercent)/100;
		double totalfeeafterdutection=fee-discountassigned;
		System.out.println(" The discount amount is INR" +discountassigned+ "and final discounted fee is INR "+totalfeeafterdutection);

	}
}