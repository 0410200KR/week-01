import java.util.*;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
	    // Convert cm to meters
        height = height / 100; 
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } 
		else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } 
		else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        }
		else {
            return "Obese";
        }
    }

    // Method to compute BMI and status and store in a 2D String array
    public static String[][] computeBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4]; // columns for weight, height, BMI, and status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = determineBMIStatus(bmi);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.format("%.2f", bmi); // format BMI to 2 decimal places
            result[i][3] = status;
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Compute BMI and status
        String[][] result = computeBMIAndStatus(data);

        // Display results
        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }
}
