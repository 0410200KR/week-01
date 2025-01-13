import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
		
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
		
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        
        findRoots(a, b, c);
    }

    public static void findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1 + " Root 2: " + root2);
        } 
		else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } 
		else {
            System.out.println("No real roots.");
        }
    }
}