import java.util.*;

// Making a class for sum of natural numbers 
public class SumNaturalNumbers {
    public static void main(String[] args) {
	
// making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int sum = calculateSum(n);
        System.out.println("The sum of " + n + " natural numbers is: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}