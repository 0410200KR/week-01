/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;
class HeightCentimeterToFoot{
  public static void main(String[]args){
  //Create Scanner Object to take user input from Standard Input 
  Scanner input=new Scanner(System.in);
  
  //creating variable centimeters
  double centimeters=input.nextDouble();
  
  //converting it into inches
  double inches=centimeters/2.54;
  
  //converting it into foot
  double foot=inches/12;
  
  System.out.println("Your Height in cm is "+centimeters+"while in feet is " +foot+"inches is "+inches);
  
  }
}
