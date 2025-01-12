import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number greater than 1: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } 
		else {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } 
			else {
                System.out.println(number + " is not a prime number.");
            }
        }
       
    }
}
