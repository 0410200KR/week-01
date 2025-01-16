import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                frequency[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j] = '0'; // Mark as counted
                    }
                }
            }
        }
        
        // Calculate the size of the result array
        int size = 0;
        for (int freq : frequency) {
            if (freq != 0) {
                size++;
            }
        }

        // Store characters and their frequencies in a 1D String array
        String[] result = new String[size];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (frequency[i] != 0) {
                result[index] = "Character: " + chars[i] + ", Frequency: " + frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] frequencyResult = findCharacterFrequency(input);
        
        System.out.println("Character Frequency:");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }
        
        scanner.close();
    }
}
