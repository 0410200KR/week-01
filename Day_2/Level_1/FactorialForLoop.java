import java.util.*;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } 
		else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
        
    }
}
