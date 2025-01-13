import java.util.*;

public class FootballTeamStatistics {

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println("\nTotal height: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }

    // Generate random heights for players
    public static int[] generateRandomHeights(int size, int min, int max) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    // Find the sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Find the mean height
    public static double findMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }

    // Find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
