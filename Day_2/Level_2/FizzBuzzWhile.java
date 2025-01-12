import java.util.*;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } 
		else {
            int i = 1;
            while (i <= number) 
			{
			   // // Print FizzBuzz for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0)
				{
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0)
				{
                    System.out.println("Fizz");
                } 
				else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
				
				// Print the number itself
				else {
                    System.out.println(i);
                }
                i++;
            }
        }
      
    }
}
