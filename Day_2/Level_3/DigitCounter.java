import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Get input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();  

        int count = 0;  

        // Use a loop to count digits until number becomes zero
        while (number != 0) {
		   // Remove the last digit
            number /= 10;  
            count++; 
        }

        System.out.println("Number of digits: " + count);  
       
}
