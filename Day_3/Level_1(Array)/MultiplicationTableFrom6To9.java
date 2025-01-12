/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.*;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Get the number from the user
        System.out.println("Enter a number to print its multiplication table from 6 to 9:");
        int number = input.nextInt(); 
		
		if(number<6 || number>9){
		   System.out.println(" Please enter a number to print its multiplication table from 6 to 9:");
		   return ;
		}

        // Array to store multiplication results for 6 to 9
		int[] multiplicationResult = new int[10]; 

        // Loop to calculate the multiplication results from 6 to 9
        for (int i = 1; i <= 10; i++) {
		    // Store the result in the array
            multiplicationResult[i - 1] = number * i; 
        }

        // Loop to display the multiplication results
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}
