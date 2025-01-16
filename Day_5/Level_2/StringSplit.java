import java.util.Scanner;

public class StringSplit {
    
    // Method to find the length of a String without using length()
    public static int getLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the text into words using charAt() method
    public static String[] customSplit(String str) {
        int wordCount = 0;
        int length = getLength(str);
        
        // Count words based on spaces
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        // Extract words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' || i == length - 1) {
                if (i == length - 1) i++; // Include the last character
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a text: ");
        String input = scanner.nextLine();

        // Use built-in split() method
        String[] s = input.split(" ");

        // Use custom split method
        String[] customSplit = customSplit(input);

        // Compare results
        boolean areEqual = compareArrays(s, customSplit);

        // Display results
        System.out.println("Custom Split Words:");
        for (String word : customSplit) {
            System.out.print(word + " ");
        }
        System.out.println("\nBuilt-in Split Words:");
        for (String word : s) {
            System.out.print(word + " ");
        }

        System.out.println("\nAre both splits equal? " + areEqual);

        scanner.close();
    }
}
