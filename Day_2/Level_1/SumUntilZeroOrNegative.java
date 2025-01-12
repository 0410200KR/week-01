/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/
import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        double total = 0.0;
		
		System.out.print("Enter a number (0 to stop): ");
        double num = input.nextDouble();
        
		//check it is 0 or negative.
        while (true) {
            
			
            if (num == 0 && num<0) {
                break;
            }
			
			//sum of all numbers
            total += num;
        }
		
		//display sum
        System.out.println("The total sum is: " + total);
    }
}
