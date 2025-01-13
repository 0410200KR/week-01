/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/
import java.util.*;
public class NumberCheck{
  public static void main(String []args){
  
    //input object is created
    Scanner input= new Scanner(System.in);
	
	 // Array to store 5 numbers
	int numbers[]=new int[5];
	
	System.out.println("enter the age of number: ");
	for(int i=0;i<numbers.length;i++){
	   numbers[i]=input.nextInt();
	}
	
	// Loop to check the properties of each number
	for(int i=0;i<numbers.length;i++){
	    int number=numbers[i];
	    if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } 
				else {
                    System.out.println(number + " is positive and odd.");
                }
            }
			else if (number < 0) {
                System.out.println(number + " is negative.");
            }
			else {
                System.out.println(number + " is zero.");
            }
	}
	
	 // Compare the first and last elements of the array
	int firstNumber=numbers[0];
	int lastNumber=numbers[numbers.length-1];
	 if (firstNumber > lastNumber) {
            System.out.println("The first element is greater than the last element.");
        } 
		else if (firstNumber < lastNumber) {
            System.out.println("The first element is less than the last element.");
        } 
		else {
            System.out.println("The first and last elements are equal.");
        }
	
	
	
  }
}