import java.util.*;

public class Array2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
		
        System.out.println("Enter the number of columns:");
        int cols = input.nextInt();

        // Create a 2D array and take user input for its elements
        int[][] matrix = new int[rows][cols];
		
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to store elements of the 2D array
        int[] array1D = new int[rows * cols];
		 // Index for the 1D array
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1D[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
    }
}
