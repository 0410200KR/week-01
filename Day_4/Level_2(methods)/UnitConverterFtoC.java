public class UnitConverterFtoC {
    public static void main(String[] args) {
        double fahrenheit = 100;
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        double celsius = 37;
        System.out.println("37 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}