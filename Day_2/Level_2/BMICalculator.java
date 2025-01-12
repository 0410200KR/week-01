import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
		 // Read user input for weight
        double weight = input.nextDouble(); 
		
		 // Read user input for height
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble(); 
		
        // Convert height from cm to meters
        double heightM = heightCm / 100;  
		
		// Calculate BMI
        double bmi = weight / (heightM * heightM);  

        System.out.println("BMI: " + bmi);  
		
        // Determine the BMI category
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } 
		else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } 
		else if (bmi < 29.9) {
            System.out.println("Overweight");
        } 
		else {
            System.out.println("Obese");
        }
      
    }
}
