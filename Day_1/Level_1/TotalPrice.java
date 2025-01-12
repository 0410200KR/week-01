/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/
import java.util.*;
class TotalPrice{
  public static void main(String[]args){
  
   //Create Scanner Object to take user input from Standard Input 
   Scanner input=new Scanner(System.in);
   
   // create a variable unitPrice and Quantity
   System.out.print("Enter the unitprice: ");
   double unitPrice = input.nextDouble();
   System.out.print("Enter the quantity: ");
   int quantity = input.nextInt();
   
   //computing in totalPrice
   double totalPrice = unitPrice * quantity;
   System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
	
	}
}