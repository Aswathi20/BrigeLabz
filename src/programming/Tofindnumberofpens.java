package programming;

public class Tofindnumberofpens {

	public static void main(String[] args) {
	
	    int totalnumberofpen=14;
	    int numberofstudent=3;
	    
	    //method to find the number of pens for each student
	    
	    
		int numberofpensforeachstud=totalnumberofpen/numberofstudent;
	    
	    int numberofpensremaining= totalnumberofpen %numberofstudent;
	    
	    
	    System.out.println("The Pen Per Student is"+" " +numberofpensforeachstud+" and the "
	    		+ "remaining pen not distributed is"+" "+numberofpensremaining);
	    

	}

}
