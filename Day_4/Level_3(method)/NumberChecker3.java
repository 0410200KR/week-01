import java.util.*;


public class NumberChecker3 {

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

        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean isEqual = Arrays.equals(digits, reversedDigits);
        System.out.println("Are original and reversed digits arrays equal: " + isEqual);

        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is the number a palindrome: " + isPalindrome);

        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is the number a duck number: " + isDuckNumber);
        
        scanner.close();
    }

    // Method to count the digits in a number
    public static int countDigits(int number) 
	{
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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) 
	{
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
		{
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return Arrays.equals(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) 
	{
        for (int digit : digits) 
		{
            if (digit == 0) 
			{
                return true;
            }
        }
        return false;
    }
}
