import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int count = input.nextInt();

        double[][] personData = new double[count][3];
        String[] weightStatus = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter weight for person " + (i + 1) + ":");
            personData[i][0] = input.nextDouble();
            System.out.println("Enter height for person " + (i + 1) + ":");
            personData[i][1] = input.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: Weight = %.2f, Height = %.2f, BMI = %.2f, Status = %s%n", 
                i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }

    private static String getWeightStatus(double bmi) {
        if (bmi < 18.5) 
		{return "Underweight";
		}
        else if (bmi < 24.9){
		 return "Normal weight";}
        else if (bmi < 29.9) 
		  {return "Overweight";
		  }
        else {
		 return "Obesity";}
    }
}
