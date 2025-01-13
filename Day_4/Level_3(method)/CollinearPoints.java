import java.util.*;

class CollinearPoints {

    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC;
    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt(), y1 = input.nextInt();
        int x2 = input.nextInt(), y2 = input.nextInt();
        int x3 = input.nextInt(), y3 = input.nextInt();

        System.out.println("Collinear using Slope: " + areCollinear(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear using Area: " + checkCollinearUsingArea(x1, y1, x2, y2, x3, y3));
    }
}