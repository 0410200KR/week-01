/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
		
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
		
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
         
		 //checking for largest number
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
		
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
		
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        
		//display result
        System.out.println("Is the first number the largest? " + isFirstLargest);
		
        System.out.println("Is the second number the largest? " + isSecondLargest);
		
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}
