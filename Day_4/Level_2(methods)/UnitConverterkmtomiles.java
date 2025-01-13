public class UnitConverterkmtomiles {
    public static void main(String[] args) {
        double km = 10;
		
        System.out.println("10 kilometers to miles: " + convertKmToMiles(km));
        double miles = 6;
		
        System.out.println("6 miles to kilometers: " + convertMilesToKm(miles));
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
}