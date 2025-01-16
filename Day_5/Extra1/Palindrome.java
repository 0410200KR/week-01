import java.lang.*;
import java.util.*;
public class Palindrome{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   String input=sc.nextLine();
	   String reverse="";
	   for(int i=input.length()-1;i>=0;i--){
	       reverse+=input.charAt(i);
	   }
	   if(input.equals(reverse)){
	      System.out.println(input+" is a palindrome ");
	   }
	   else{
	      System.out.println(input+"is not a palindrome ");
	   }
	   

	}
}