import java.util.*;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
	
    public static void generateNumberFormatException(String input) {
        // Trying to convert a non-numeric string to an integer
        System.out.println(Integer.parseInt(input));
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String input) {
        try {
            // Attempt to parse the string to an integer
			
            System.out.println(Integer.parseInt(input));
        } 
		catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nGenerating NumberFormatException:");
        

        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(userInput);
    }
}
