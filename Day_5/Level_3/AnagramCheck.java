import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Removing spaces and converting to lowercase
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Frequency array for ASCII characters
        int[] frequency = new int[256];

        // Increment frequency for characters in text1
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
        }

        // Decrement frequency for characters in text2
        for (int i = 0; i < text2.length(); i++) {
            frequency[text2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        boolean result = areAnagrams(text1, text2);
        System.out.println("Are the two strings anagrams? " + result);

        scanner.close();
    }
}
