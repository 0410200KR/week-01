import java.util.*;
public class Hello{
  public static void main(String[]args){
    Scanner input=new Scanner (System.in);
	
	System.out.println("enter the number: ");
	int number=input.nextInt();
	
	for(int i=number; i<=10; i++){
	   if(i==5 ){
	     System.out.println("Hello ");
		 
	   }
	   else if(i==8){
	     System.out.println("kanak");
		 
		 }
		else if (i==10){
		  System.out.println("goodbye");
           
		   
		}
		System.out.println(i);
		
		
		
	}
  }
}