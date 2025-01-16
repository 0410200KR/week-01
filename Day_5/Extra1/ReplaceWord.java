import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.next();
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        String result = sentence.replaceAll("\\b" + wordToReplace + "\\b", newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
