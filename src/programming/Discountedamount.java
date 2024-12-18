package programming;

public class Discountedamount {

	public static void main(String[] args) {
		double fee=125000;
		double discountedpercent=10;
		
		//calculating the discount amount
		
		double discountedamount=(fee*discountedpercent)/100;
		
		// calcutlate the final amount after dutection of price is
		
		double discountesprice=fee-discountedamount;
		
		
		System.out.println("Discounted Amount: INR " +" "+discountedamount);
		System.out.println("Discounted Price: INR"+" "+discountesprice);

	}

}
