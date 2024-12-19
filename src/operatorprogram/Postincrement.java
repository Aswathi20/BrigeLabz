package operatorprogram;

public class Postincrement {
	 public static void postAndPreIncrement() {
	        int num = 10;
	        System.out.println("Initial value: " + num);
	        System.out.println("Post-increment: " + (num++));
	        System.out.println("After post-increment: " + num);
	        System.out.println("Pre-increment: " + (++num));
	    }



	public static void main(String[] args) {
		postAndPreIncrement();
		
	}

}
