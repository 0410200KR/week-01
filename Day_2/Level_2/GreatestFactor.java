import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // Read user input
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();  

         // Initialize greatestFactor to 1
		int greatestFactor = 1;
		
        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  
                break;  
            }
        }

        // Print the greatest factor
        System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        
    }
}
