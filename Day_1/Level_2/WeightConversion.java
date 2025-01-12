/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/
import java.util.*;

public class WeightConversion {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();
        
		//converting in kilogram by dividing
        double kilograms = pounds / 2.2;
        
		//display result
        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);

       
    }
}
