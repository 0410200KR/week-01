import java.util.Scanner;

// Making a class for smallest and largest number
public class SmallestLargest {
    public static void main(String[] args) {
     // making input as a object of Scanner class 
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
		
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
		
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }
}