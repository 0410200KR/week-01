import java.util.*;

//creating a class for calculating maximum handshakes 
public class MaximumHandshakes {

    public static void main(String[] args) {
     // making input as an object of Scanner class
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        
        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}