import java.util.*;

public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == num;
    }

    // Method to check if a number is spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1, digit;
        while (num != 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10) {
                return false;
            }
            num /= 10;
            square /= 10;
        }
        return true;
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Is " + num + " a prime number? " + isPrime(num));
        System.out.println("Is " + num + " a neon number? " + isNeon(num));
        System.out.println("Is " + num + " a spy number? " + isSpy(num));
        System.out.println("Is " + num + " an automorphic number? " + isAutomorphic(num));
        System.out.println("Is " + num + " a buzz number? " + isBuzz(num));

        scanner.close();
    }
}
