import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = input.charAt(0);
        int maxCount = 0;
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                mostFrequent = c;
                maxCount = charCount.get(c);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
