import java.util.*;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		 // Array to store the heights of 11 players
        double[] heights = new double[11];
		// Variable to store the sum of all heights
        double sum = 0.0; 

        System.out.println("Enter the heights of 11 football players:");

        // Loop to get user input for each player's height
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
			// Add each height to the sum
            sum += heights[i]; 
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}
