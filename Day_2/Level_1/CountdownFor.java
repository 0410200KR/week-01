import java.util.*;

public class CountdownFor {
    public static void main(String[] args) {
	    
		// create a scanner object
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the countdown starting value: ");
        int counter = input.nextInt();

        for(int i=counter; i>=1; i--) {
            System.out.println(i);
            
        }
		
		//display result
        System.out.println("Rocket launch!");
    }
}