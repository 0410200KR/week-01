import java.lang.*;
import java.util.*;
public class ReverseString{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   String input=sc.nextLine();
	   String reverse="";
	   for(int i=input.length()-1;i>=0;i--){
	       reverse+=input.charAt(i);
	   }
	   System.out.println("reverse string : "+reverse);
	   

	}
}