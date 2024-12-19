package programmingelements;

public class Earthpercent {

	public static void main(String[] args) {
		double radiusKm = 6378;

		double kmToMiles = 0.621371;

		double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

		double radiusMiles = radiusKm * kmToMiles;

		// Compute the volume in cubic miles
		double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

		System.out.println("The volume of earth in cubic kilometers is "+ volumeKm3+" "+"and "
				+ "cubic miles is "+" "+volumeMiles3 );
	}
}









