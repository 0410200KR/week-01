/*Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___
*/
import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
		
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
		//swaping the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);


    }
}
