/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.*;
class AreaOfTriangle{
  public static void main(String[]args){
  
  //Create Scanner Object to take user input from Standard Input 
  Scanner input=new Scanner(System.in);
   
   // create a variable base and height and take user inputs
   double baseCm=input.nextDouble();
   double heightCm=input.nextDouble();
   
   //computing area of triangle
   double AreaOfTriangle=0.5*baseCm*heightCm;
   
   // converting in inches 
   double areaInInches = AreaOfTriangle * 0.155;
   
   //converting height in inches
   double heightInches = heightCm / 2.54;
   
   //converting height in Feet
   int heightFeet = (int) (heightInches / 12);
   
   System.out.println("Your Height in cm is "+heightCm+" while in feet is "+ heightFeet+" and inches is "+heightInches); 
  }
}
   