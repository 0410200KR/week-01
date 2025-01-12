import java.util.* ;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int digitCount = 0, temp = number;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];

        // Extract digits in reverse
        for (int i = 0; number != 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display digits in reverse
        System.out.println("Reversed number:");
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}
