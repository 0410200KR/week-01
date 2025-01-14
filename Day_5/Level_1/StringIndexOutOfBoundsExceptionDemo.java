import java.util.*;
import java.lang.StringIndexOutOfBoundsException; // Explicitly import the built-in exception

public class StringIndexOutOfBoundsExceptionDemo {

  public static void GeneratingTheException(String k) {
    // Accessing an index beyond the length of the string to cause an exception
    System.out.println(k.charAt(k.length()));
  }

  public static void handleException(String k) {
    try {
      // Trying to access an index beyond the length of the string
      System.out.println(k.charAt(k.length()));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Handling the exception
      System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String st = input.next();

    System.out.println("Generating The Exception:");
    // Uncomment to see the exception
    // GeneratingTheException(st);

    System.out.println("\nHandling StringIndexOutOfBoundsException:");
    handleException(st);
  }
}
