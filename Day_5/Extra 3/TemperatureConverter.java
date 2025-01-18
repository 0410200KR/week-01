import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char scale = sc.next().charAt(0);

        if (scale == 'C' || scale == 'c') {
            System.out.println("Converted Temperature: " + toCelsius(temp) + " °C");
        } else if (scale == 'F' || scale == 'f') {
            System.out.println("Converted Temperature: " + toFahrenheit(temp) + " °F");
        } else {
            System.out.println("Invalid input.");
        }
    }

    private static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
