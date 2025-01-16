import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare with reversed string
    public static boolean isPalindromeReversed(String text) {
	String reversed = new StringBuilder(text).reverse().toString();
	 return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        
        // Removing non-alphanumeric characters and converting to lowercase for consistency
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Logic 1
        boolean resultIterative = isPalindromeIterative(cleanInput);
        System.out.println("Palindrome check using iterative method: " + resultIterative);

        // Logic 2
        boolean resultRecursive = isPalindromeRecursive(cleanInput, 0, cleanInput.length() - 1);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);

        // Logic 3
        boolean resultReversed = isPalindromeReversed(cleanInput);
        System.out.println("Palindrome check using reversed string method: " + resultReversed);

        scanner.close();
    }
}
 
