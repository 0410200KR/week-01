import java.util.*;

public class TextSplitter {

    // Method to split text into words using charAt() method
	
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];
        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }

        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using the length() method
    public static int findStringLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextIntoWords(inputText);
        String[][] wordsWithLengths = getWordsAndLengths(words);

        System.out.println("\nWord\tLength");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }
    }
}
