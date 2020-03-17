package arrays.minimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        // challenge 1: get the minimum value from your console-inputted array
        System.out.println("Minimum: " + findMin(readIntegers(4)));

        // challenge 2: reverse the order of your array...
        int[] array2 = readIntegers(5);
        System.out.println(Arrays.toString(array2));
        reverse(array2);
        System.out.println(Arrays.toString(array2));
    }


    private static void reverse(int[] arrayToReverse){

//        int[] tempArray = new int[arrayToReverse.length];
        int maxIdx = arrayToReverse.length - 1;
        for(int i = 0; i<arrayToReverse.length / 2; i++){
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[maxIdx - i];
            arrayToReverse[maxIdx - i] = temp;
        }

    }


    private static int[] readIntegers(int howManyInts) {
        int[] intArray = new int[howManyInts];
        for(int i=0; i<howManyInts; i++) {

            System.out.print("Enter a number: ");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
        // ^^ this was fun the first time, but no54
        // ...
//        return new int[]{543, 3, 8256, 294, 44, 627};
    }

    private static int findMin(int[] arrayOfInts) {
//        int min = 0;  // what if we have no negative numbers!? then 0 will be returned incorrectly!
        int min = arrayOfInts[0];
        for(int i = 0; i<arrayOfInts.length; i++) {
            min = (arrayOfInts[i] < min) ? arrayOfInts[i] : min;
        }
        return min;
    }


}
