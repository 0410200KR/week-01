import java.util.*;

// Making a class for QuotientRemainder 
public class QuotientRemainder {
    public static void main(String[] args) {
     // making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter dividend: ");
        int number = input.nextInt();
		
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }
}