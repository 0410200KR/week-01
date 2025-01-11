/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/
import java.util.*;
class ArithmeticOperators{
  public static void main(String[]args){
  
  //Create Scanner Object to take user input from Standard Input 
  Scanner input=new Scanner(System.in);
   
   // create a variable number1 and number 2 and take user inputs
   double number1=input.nextDouble();
   double number2=input.nextDouble();
   
   // create a variable add,sub,multi and div
   double add=number1 + number2;
   double sub=number1 - number2;
   double multi=number1 * number2;
   double div=number1 / number2;
   System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  " + number1 + " and "+number2+" is" +add+" ,"+sub+" ,"+multi+" , and"+div);
   
  }
 }