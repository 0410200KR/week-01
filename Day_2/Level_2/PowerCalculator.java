import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		 // Read user input for the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt(); 
		
		 // Read user input for the power
		 
        System.out.print("Enter the power: ");
        int power = input.nextInt(); 

        // Initialize result to 1
		int result = 1;  
		
        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            result *= number;  
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
       
}
