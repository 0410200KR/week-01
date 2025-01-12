/*Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___*/
import java.util.*;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the person's name
        System.out.print("Enter the name of the person traveling: ");
        String name = input.nextLine();

        //  user input for the cities
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = input.nextLine();
		
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();
		
        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();
		

        //  user input for distances and times
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = input.nextDouble();
		
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");

        
    }
}
   
