import java.util.Scanner;

public class CharacterFrequency2D {

    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }
        
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] frequencies = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequencies[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequencies[uniqueChars[i]]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] frequencyResult = findCharacterFrequency(input);
        
        System.out.println("Character Frequency:");
        for (String[] entry : frequencyResult) {
            System.out.println("Character: " + entry[0] + ", Frequency: " + entry[1]);
        }
        
        scanner.close();
    }
}
