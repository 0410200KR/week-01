/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/
import java.util.*;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get an integer input from the 
		
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
			// Exit the program if the input is not a natural number
            return; 
        }

        // Initialize arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
		// Index for odd numbers array
        int oddIndex = 0; 
		// Index for even numbers array
        int evenIndex = 0; 

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
		
            if (i % 2 == 0) {
			     // Add even number to the evenNumbers array
                evenNumbers[evenIndex++] = i;
            }
			else {
			// Add odd number to the oddNumbers array
                oddNumbers[oddIndex++] = i; 
            }
        }

        // Display the odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display the even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
