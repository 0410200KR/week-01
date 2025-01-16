import java.util.Scanner;

public class VowelsConsonantsLowerCaseString2D {

    // Method to convert string to lowercase
    public static String convertToLower(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) < 95) {
                int x = (int) s.charAt(i) + 32;
                ans += (char) x;
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    // Method to find vowels and consonants and store them in a 2D array
    public static String[][] findVowelsAndConsonants(String s) {
        int len = s.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result[i][0] = String.valueOf(ch);
                result[i][1] = "Vowel";
            } else if (ch >= 'a' && ch <= 'z') {
                result[i][0] = String.valueOf(ch);
                result[i][1] = "Consonant";
            } else {
                result[i][0] = String.valueOf(ch);
                result[i][1] = "Not a letter";
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayVowelConsonantTable(String[][] data) {
        System.out.println("Character | Type");
        System.out.println("---------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "    | " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Convert string to lowercase
        String lowerStr = convertToLower(str);
        System.out.println("Lowercase String: " + lowerStr);

        // Find vowels and consonants
        String[][] vowelsAndConsonants = findVowelsAndConsonants(lowerStr);

        // Display the result in tabular format
        displayVowelConsonantTable(vowelsAndConsonants);
    }
}
