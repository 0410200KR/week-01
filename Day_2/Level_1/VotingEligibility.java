/**/
import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();
         
		 // check for age eligiblity
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } 
		else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
