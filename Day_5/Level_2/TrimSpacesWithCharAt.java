import java.util.Scanner;

public class TrimSpacesWithCharAt {

    // Method to trim the leading and trailing spaces from a string using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the index of the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the index of the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indexes of the trimmed string
        return new int[]{start, end};
    }

    // Method to create a substring using charAt() and start, end indices
    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Trim spaces using custom method
        int[] trimmedIndexes = trimSpaces(input);
        String trimmedStringUsingCharAt = createSubstring(input, trimmedIndexes[0], trimmedIndexes[1]);

        // Trim spaces using the built-in trim() method
        String trimmedStringUsingTrim = input.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedStringUsingCharAt, trimmedStringUsingTrim);

        // Display the results
        System.out.println("Trimmed String using charAt(): '" + trimmedStringUsingCharAt + "'");
        System.out.println("Trimmed String using trim(): '" + trimmedStringUsingTrim + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        sc.close();
    }
}
