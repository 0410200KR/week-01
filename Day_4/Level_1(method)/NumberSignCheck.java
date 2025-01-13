import java.util.*;

//making a class for number sign check 
public class NumberSignCheck {
    public static void main(String[] args) {
         // making input as an object of Scanner class
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int result = checkSign(number);
        if (result == 1)
		{
            System.out.println("The number is positive.");
        } 
		else if (result == -1) 
		{
            System.out.println("The number is negative.");
        }
		else 
		{
            System.out.println("The number is zero.");
        }
    }

    public static int checkSign(int num) {
        return (num > 0) ? 1 : (num < 0) ? -1 : 0;
    }
}