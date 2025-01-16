import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        int count = 0;
        int index = mainString.indexOf(substring);
        while (index != -1) {
            count++;
            index = mainString.indexOf(substring, index + 1);
        }

        System.out.println("The substring occurs " + count + " times.");
    }
}
