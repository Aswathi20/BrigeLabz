package programmingelements;

public class Tocalculateprofitandloss {

	public static void main(String[] args) {
		double sellingprice=191.0;
		double costprice=129;
		
		double profit=sellingprice-costprice;
		
		double ProfitPercentage=profit/costprice*100;
		
		System.out.println("The Cost Price is INR "+costprice+"and Selling Price is INR"+
		sellingprice+"\n"+"The Profit is INR"+ profit+" and the Profit Percentage is "+ProfitPercentage
);

	}

}
