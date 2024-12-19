package programmingelements;
public class Discountedamount {
	public static void main(String[] args) {
		double fee=125000;
		double discountedpercent=10;
		double discountedamount=(fee*discountedpercent)/100;
		double discountesprice=fee-discountedamount;
		System.out.println("Discounted Amount: INR " +" "+discountedamount);
		System.out.println("Discounted Price: INR"+" "+discountesprice);
	}
}
