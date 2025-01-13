import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.println("Enter a positive integer:");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
		    // Exit the program if the input is not positive
            System.out.println("Error: Please enter a positive integer.");
            return; 
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Loop to generate FizzBuzz results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
			else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
			else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
			else {
                results[i] = Integer.toString(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
