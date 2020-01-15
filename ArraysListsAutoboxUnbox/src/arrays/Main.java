package arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int[] myInts = getInts(5);

        System.out.println("Array value average = " + getAverage(myInts));
    }

    public static double getAverage(int[] numArray) {
        int total = 0;
        for(int i = 0; i < numArray.length; i++) {
            total += numArray[i];
        }
        return total / numArray.length;
    }

    public static int[] getInts(int elementsCount) {
        System.out.println("Enter " + elementsCount + " integer values.\r");
        int[] values = new int[elementsCount];

        for(int i = 0; i < elementsCount; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}