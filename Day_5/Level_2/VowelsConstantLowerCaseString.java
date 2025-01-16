import java.util.Scanner;

 class VowelsConsonantsLowerCaseString {

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

    public static void countVowelsConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String lowerStr = convertToLower(str);
        System.out.println("Lowercase String: " + lowerStr);

        countVowelsConsonants(lowerStr);
    }
}
