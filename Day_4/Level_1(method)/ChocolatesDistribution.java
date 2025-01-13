import java.util.*;

// Making a class for ChocolatesDistribution 
public class ChocolatesDistribution {
    public static void main(String[] args) {
    // making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
		
        System.out.print("Enter number of children: ");
        int children = input.nextInt();
        
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }
}