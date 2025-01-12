/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/
import java.util.*;
class PerimeterOfSquare{
  public static void main(String[]args){
  
  //Create Scanner Object to take user input from Standard Input 
  Scanner input=new Scanner(System.in);
   
   // create a variable perimeter 
    double perimeter = input.nextDouble();
	
	//perimeter of square is 4*sides
    double side = perimeter / 4;
	
    System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}