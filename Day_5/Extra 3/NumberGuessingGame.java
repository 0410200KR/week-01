import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = scanner.nextLine();

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! The computer guessed it!");
                    correct = true;
                    break;
                default:
                    System.out.println("Please respond with 'high', 'low', or 'correct'.");
            }
        }
    }

    private static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
