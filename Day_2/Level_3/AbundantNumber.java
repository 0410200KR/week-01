import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 

        int sum = 0;

        // Loop to find all divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
			    // Add the divisor to the sum
                sum += i;  
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        }
		else {
            System.out.println(number + " is not an Abundant number.");
        }
        
    }
}
