import java.util.*;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ":");
            ages[i] = input.nextInt();
            System.out.println("Enter height of " + friends[i] + ":");
            heights[i] = input.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
			 youngestIndex = i;}
            if (heights[i] > heights[tallestIndex]){ 
		            tallestIndex = i;}
        }

        // Display results
        System.out.println("The youngest is " + friends[youngestIndex]);
        System.out.println("The tallest is " + friends[tallestIndex]);
    }
}
