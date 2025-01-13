public class UnitConverterYtoF {

    public static void main(String[] args) {
	
        double yards = 10;
        System.out.println("10 yards to feet: " + convertYardsToFeet(yards));
		
        double feet = 20;
        System.out.println("20 feet to yards: " + convertFeetToYards(feet));
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
}