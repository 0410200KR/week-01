/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result*/
import java.util.*;

public class SumWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } 
		else {
		
            // Using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Using formula
            int sumFormula = n * (n + 1) / 2;

            // Comparing results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
			
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            }
        }
        
    }
}

