public class EarthVolume{
  public static void main(String[]args){
   
	    // create a variable radiusEarthKm for assign value
		double radiusEarthKm = 6378;
		
		// creating a variable volumeEarthKm 
        double volumeEarthKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarthKm, 3);
		
		// conversion factor 0.621371^3
        double volumeEarthMiles = volumeEarthKm / Math.pow(0.621371, 3);
		
		//display result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeEarthKm + " and cubic miles is " + volumeEarthMiles);
		
    }
	
	
  }  