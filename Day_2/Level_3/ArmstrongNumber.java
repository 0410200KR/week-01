import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Get input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();  

        int originalNumber = number;  
        int sum = 0; 

        // Use a while loop to iterate until originalNumber is not zero
        while (originalNumber != 0) {
		    
			// Find the remainder
            int remainder = originalNumber % 10;  
			
			// Add the cube of the remainder to the sum
            sum += Math.pow(remainder, 3); 

             // Remove the last digit			
            originalNumber /= 10;  
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        }
		else {
            System.out.println(number + " is not an Armstrong number.");
        }
       
    }
}
