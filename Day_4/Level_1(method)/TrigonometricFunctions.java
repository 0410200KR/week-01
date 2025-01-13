import java.util.*;

// Making a class for Trigonometric functions
public class TrigonometricFunctions {

    public static void main(String[] args) {

       // making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0] + ", Cosine: " + results[1] + ", Tangent: " + results[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
}