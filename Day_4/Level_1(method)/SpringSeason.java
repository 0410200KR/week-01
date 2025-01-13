import java.util.*;

//making a class to check the Spring Season
public class SpringSeason {
    public static void main(String[] args) {
       // making input as an object of Scanner class
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter month: ");
        int month = input.nextInt();
		
        System.out.print("Enter day: ");
        int day = input.nextInt();
        
        boolean isSpring = checkSpringSeason(month, day);
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } 
		else {
            System.out.println("Not a Spring Season.");
        }
    }

    public static boolean checkSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
    }
}