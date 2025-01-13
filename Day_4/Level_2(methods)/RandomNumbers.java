import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);
        System.out.println("Average: " + results[0] + " Min: " + results[1] + " Max: " + results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        Scanner random = new Scanner();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[] { sum / numbers.length, min, max };
    }
}