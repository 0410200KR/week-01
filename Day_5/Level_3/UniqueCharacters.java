import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != 0) System.out.print(c + " ");
        }
    }

    static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = current;
            }
        }
        return unique;
    }
}
