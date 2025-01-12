/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
*/
import java.util.*;
public class VotingEligibility{
  public static void main(String []args){
  
    //input object is created
    Scanner input= new Scanner(System.in);
	
	 // Array to store ages of 10 students
	int age[]=new int[10];
	
	System.out.println("enter the age of student: ");
	 // Loop to get user input for each student's age
	for(int i=0;i<age.length;i++){
	   age[i]=input.nextInt();
	}
	
	// Loop to check each age and print if the student can vote or not
	for(int i=0;i<age.length;i++){
		int ages=age[i];
	   if(ages<0){
	     System.out.println("invalid age");
	   }
	   else if(ages>=18){
	      System.out.println("The student with the age "+age[i]+" can vote.");
	   }
	   else{
	      System.out.println("The student with age  the "+age[i]+" cannot vote.");
	   }
	}
	
  }
}