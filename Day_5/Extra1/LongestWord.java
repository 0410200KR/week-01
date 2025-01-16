import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");  // Split sentence into words
        String longestWord = "";
        
        for (String word : words)
		{
            if (word.length() > longestWord.length()) {
                longestWord = word;  // Update longest word if current word is longer
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input
		
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();  // Read the entire line of input
        
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);
        
        scanner.close();  // Close the scanner
    }
}
