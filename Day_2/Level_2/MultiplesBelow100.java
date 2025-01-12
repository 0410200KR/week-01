import java.util.*;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  

        System.out.println("Multiples of " + number + " below 100 are:");
		
        // Loop from 100 down to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i); 
            }
        }
        
    }
}
