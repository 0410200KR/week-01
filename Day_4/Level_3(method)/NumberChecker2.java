import java.util.*;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);

        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad number: " + isHarshad);

        int[][] digitFrequency = digitFrequency(number);
        System.out.println("Digit frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i][1] > 0) 
			{
                System.out.println("Digit " + digitFrequency[i][0] + ": " + digitFrequency[i][1] + " times");
            }
        }
        
        scanner.close();
    }

    // Method to count the digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to get the digits of a number as an array
    public static int[] getDigits(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in a number
    public static int[][] digitFrequency(int number) {
        int[] frequency = new int[10]; // For digits 0-9
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = frequency[i];
        }
        return result;
    }
}
