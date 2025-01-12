/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/
import java.util.*;
public class DivisibleProgram{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
	System.out.println("enter the number: ");
	int number=input.nextInt();
	
	//  check if a number is divisible by 5 
    boolean isDivisible = (number % 5 == 0);
    System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
	
  }
 }