import java.util.*;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  

        System.out.println("Factors of " + number + " are:");
        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);  
            }
        }
       
    }
}
