/*Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.*;
public class MultiplicationTable{
  public static void main(String []args){
  
    //input object is created
    Scanner input= new Scanner(System.in);
	
	// Get the number for the multiplication table
	System.out.println("Enter a number to print its multiplication table:");
        int number = input.nextInt(); 
	
	 // Array to store result
	     
	int MultiplicationTable[]=new int[10];
	
	
	for(int i=1;i<=MultiplicationTable.length;i++){
	    MultiplicationTable[i-1]=number*i;
	}
	  System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + MultiplicationTable[i - 1]);
        }
	}
}