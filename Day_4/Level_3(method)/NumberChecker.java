import java.util.Arrays;

////making a class for Number check
public class NumberChecker {
    public static void main(String[] args) {
        int number = 153; // Example number

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(storeDigits(number)));
        System.out.println("Duck Number: " + isDuckNumber(storeDigits(number)));
        System.out.println("Armstrong Number: " + isArmstrongNumber(storeDigits(number)));
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        int num = 0;
        for (int digit : digits) {
            num = digit * digit * digit;
            sum += num;
        }
        return sum == Integer.parseInt(String.valueOf(digits));
    }
}