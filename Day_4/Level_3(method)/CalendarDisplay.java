import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to check for a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("   " + getMonthName(month) + " " + year);
        System.out.println(" S  M  T  W  Th F  S");

        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDaysInMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }
}
