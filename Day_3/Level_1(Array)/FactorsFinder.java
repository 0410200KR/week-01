import java.util.*;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.println("Enter a number to find its factors:");
        int number = input.nextInt();

        // Initialize variables
        int maxFactor = number; 
        int[] factors = new int[maxFactor];
        // Index to track the position in the factors array		
        int index = 0; 

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor
               
				// Store the factor and increment the index
                factors[index++] = i; 
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
