import java.lang.*;
import java.util.*;
public class VowelsConsonants{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter a string: ");
	   String input=sc.nextLine();
	   int vowels=0;
	   int consonants=0;
	   
	   input =input.toLowerCase();
	   for(int i=0;i<input.length();i++){
	     char ch=input.charAt(i);
		 if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		    vowels++;
		 }
		 else{
		   consonants++;
		 }
	   }
	   System.out.println("vowels: "+vowels);
	   System.out.println("consonants: "+consonants);
   }
}

