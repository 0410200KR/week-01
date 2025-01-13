import java.util.*;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) 
		{
            System.out.println("Not a natural number.");
            return;
        }
        int recursiveSum = findSumRecursive(n);
        int formulaSum = n * (n + 1) / 2;
		
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);
    }

    public static int findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }
}