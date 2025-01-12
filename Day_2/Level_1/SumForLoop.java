import java.util.*;

public class SumForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Using formula
            int sumFormula = n * (n + 1) / 2;

            // Comparing results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
			
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            }
        }
      
    }
}
