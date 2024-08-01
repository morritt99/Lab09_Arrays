import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        Scanner in = new Scanner(System.in);
        double average = 0;
        int targetValue;
        int targetCount = 0;
        boolean pointFound = false;
        int val = rnd.nextInt(100) + 1;
        int index = rnd.nextInt(dataPoints.length);
        int sum = 0;


        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for (int e : dataPoints) {
            System.out.printf("%3d |", e);
        }

        for (int e : dataPoints) {
            sum += e;
        }
        average = (double) sum / dataPoints.length;

        System.out.println("\n The sum of data set is " + sum + "\nThe average of the data set is " + average);

        targetValue = SafeInput.getRangedInt(in, "Enter target number to find in data set: ", 1, 100);

        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == targetValue) {
                targetCount++;
                pointFound = true;
            }
        }
        System.out.println("The target value appears " + targetCount + " times in the array");

        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == targetValue) {
                System.out.println("\nThe target value at position " + e + " in the array");
                pointFound = true;
                break;
            }
        }
        int max = dataPoints[0];
        int min = dataPoints[99];
        for (int e : dataPoints) {
            if (e > max) // used to find a new max value
            {
                max = e;  //assigns the new highest val as max
            }
            if (e < min)  // used to find a new min value
            {
                min = e;
            }
        }
        System.out.printf("\n The min max is %4d %4d", min, max);
        System.out.println("\n Average of dataPoints is: " + getAverage(dataPoints));
    }


    public static double getAverage(int values[]) {
        int sum = 0;
        double average = 0;
        for (int i : values) {
            sum += i;
        }
        average = (double) sum / values.length;
        return average;
    }
}