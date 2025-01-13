import java.util.*;

class NumberChecker5 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int i : factors) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i : factors) 
		{
            sum += i;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) 
	{
        int product = 1;
        for (int i : factors) 
		{
            product *= i;
        }
        return product;
    }

    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int i : factors) 
		{
            product *= Math.pow(i, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == num;
    }

    public static int[] getDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        System.out.println("Greatest Factor: " + findGreatestFactor(findFactors(num)));
        System.out.println("Sum of Factors: " + sumOfFactors(findFactors(num)));
        System.out.println("Product of Factors: " + productOfFactors(findFactors(num)));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(findFactors(num)));
        System.out.println("Is Perfect: " + isPerfectNumber(num));
        System.out.println("Is Abundant: " + isAbundantNumber(num));
        System.out.println("Is Deficient: " + isDeficientNumber(num));
        System.out.println("Is Strong: " + isStrongNumber(num));
    }
}