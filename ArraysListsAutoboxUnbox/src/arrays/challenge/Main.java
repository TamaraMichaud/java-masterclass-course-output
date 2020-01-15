package arrays.challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // sort a list of integers in DESC order
        // read integers in from keyboard
        // getInts(), sortInts(), printArray()

        int[] eg1 = {2, 3,4};
        int[] eg2 = new int[]{2, 3,4};

        int[] unsortedArray = getInts(5);
//        printArray(unsortedArray);

        sortInts(unsortedArray);
        printArray(unsortedArray);
    }

    private static int[] getInts(int arraySize) {

        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter a number: ");

            intArray[i] = scanner.nextInt();
        }

//        return new int[]{1, 2, 3};
        return intArray;
    }

    private static void sortInts(int[] arrayToSort) {

        // 4, 99, 13, 71, 72, 1, 34
//        int[] orderedArray = new int[arrayToSort.length];
        boolean flag = true;
        while (flag) {
            flag = false;
//    for (int i = 0; i < orderedArray.length; i++) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {  // << simpler than checking i+1 !> length

                if (arrayToSort[i] < arrayToSort[i + 1]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                    flag = true;
                }
            }
        }

    }

    private static void printArray(int[] arrayToPrint) {

        System.out.println("Array Values Are: ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Index-" + i + " equals: " + arrayToPrint[i]);
        }
    }

}
