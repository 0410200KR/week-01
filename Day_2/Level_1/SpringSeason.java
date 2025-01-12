
import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
		
		// create a scanner object
		Scanner input=new Scanner (System.in);
		
		// create a  user defined input scanner object
		System.out.println("enter the month: ");
		int month=input.nextInt();
		
		System.out.println("enter the day: ");
		int day=input.nextInt();
		
		// march 20 to june 20
		 if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a spring season");
        } 
		
		else{
			   System.out.println("Not a spring season");
		   }
		
    }
}
