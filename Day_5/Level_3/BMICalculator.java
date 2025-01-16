import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeight = new double[10][2];
        String[][] bmiData = new String[10][4];

        // Input height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and Status
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(heightWeight[i][0], heightWeight[i][1]);
            String status = getBMIStatus(bmi);
            bmiData[i][0] = String.valueOf(heightWeight[i][0]);
            bmiData[i][1] = String.valueOf(heightWeight[i][1]);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }

        // Display data
        displayBMIData(bmiData);
    }

    static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert cm to meters
        return weight / (height * height);
    }

    static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obesity";
    }

    static void displayBMIData(String[][] data) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] person : data) {
            System.out.println(person[0] + "\t" + person[1] + "\t" + person[2] + "\t" + person[3]);
        }
    }
}
