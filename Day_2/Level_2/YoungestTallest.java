import java.util.*;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read age and height for Amar
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
		
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = input.nextInt();
        
        // Read age and height for Akbar
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
		
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();
        
        // Read age and height for Anthony
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
		
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();
        
        // Determine the youngest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
		
        // Determine the tallest height
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        
        // Print the results
        System.out.println("Youngest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight + " cm");
        
        
    }
}
