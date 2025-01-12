/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/
import java.util.*;
class NumberOfhandshakes{
  public static void main(String[]args){
  
   //Create Scanner Object to take user input from Standard Input 
   Scanner input=new Scanner(System.in);
   
   // create a variable numberOfStudents
   System.out.print("Enter the numberOfStudents: ");
   int numberOfStudents = input.nextInt();
   
   // compute max number of handshakes
   int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
   System.out.println("The maximum number of handshakes is " + maxHandshakes);
   }
  }