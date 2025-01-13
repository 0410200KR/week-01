import java.util.*;

//creating a class for calculating how many rounds athlete is going to cover 
public class AthleteRounds {
    public static void main(String[] args) {
	
     // making input as an object of Scanner class
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
		
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
		
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();
        
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}