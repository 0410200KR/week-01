import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + data[i][0] + " Height: " + data[i][1] + " BMI: " + data[i][2] + " Status: " + getBMIStatus(data[i][2]));
        }
    }

    public static double calculateBMI(double weight, double height) {
        height /= 100;
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obesity";
    }
}