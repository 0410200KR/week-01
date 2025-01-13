import java.util.*;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a year: ");
        int year = input.nextInt();
		
        if (year < 1582) {
            System.out.println("Year should be >= 1582.");
            return;
        }
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}