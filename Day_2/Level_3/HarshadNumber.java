import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();  // Get input from the user

        int sum = 0;
        int originalNumber = number;  // Store the original number

        // Use a while loop to calculate the sum of digits
        while (originalNumber != 0) {
		
		    // Add the last digit to the sum
            sum += originalNumber % 10;  
            originalNumber /= 10;  
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } 
		else {
            System.out.println(number + " is not a Harshad number.");
        }
       
    }
}
