import java.util.*;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
	
        // Using substring with start index greater than the end index to cause an exception
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
		
            // Attempt to use substring with start index greater than the end index
            System.out.println(text.substring(5, 2));
			
        }
		catch (IllegalArgumentException e) {
			
            // Handling IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        try{
			generateIllegalArgumentException(userInput);
		}
		catch(Exception e){
			System.out.println("generate an IllegalArgumentException: " + e);
		}
        handleIllegalArgumentException(userInput);
    }
}
