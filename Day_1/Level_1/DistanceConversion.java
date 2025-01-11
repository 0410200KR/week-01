/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.*;
class DistanceConversion{
  public static void main(String[]args){
  
  //Create Scanner Object to take user input from Standard Input 
  Scanner input=new Scanner(System.in);
   
   // create a variable distanceInFeet
    double distanceInFeet = input.nextDouble();
	
	//compute distance in yard and miles
	double distanceYards = distanceInFeet / 3;
    double distanceMiles = distanceYards / 1760;
	 
	 System.out.println("The distance in yards is " + distanceYards + " and in miles is " + distanceMiles);
	}
}