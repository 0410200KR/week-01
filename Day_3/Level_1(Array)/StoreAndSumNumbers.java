/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/
import java.util.*;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		 // Array to store up to 10 numbers
        double[] numbers = new double[10];
		
		// Variable to store the sum of numbers
        double total = 0.0; 
		
		// Index to track the number of elements                           
        int index = 0; 

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        // Infinite loop to take user input until 0 or a negative number is entered or 10 numbers are input
        while (true) {
            double num = input.nextDouble();
            if (num <= 0 || index == 10) {
                break; 
            }
			
			// Store the number in the array
            numbers[index] = num; 
            index++; 
        }

        // Loop to calculate the total sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i]; 
        }

        // Display all the numbers and the total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Total sum: " + total);
    }
}
