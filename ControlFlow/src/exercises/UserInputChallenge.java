package exercises;

import java.util.Scanner;

public class UserInputChallenge {

    // read 10 numbers
    // create scanner
    // user hasNextInt()
    // if false return "Invalid Number"
    // keep going til you have 10
    // use nextInt to get the number and sum it
    // prompt reads:  "Enter Digit X"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCounter = 0;
        int inputSum = 0;
        while (inputCounter < 10) {
            System.out.println("Enter number #" + inputCounter + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                inputSum += scanner.nextInt();
                inputCounter++;

            } else {
                System.out.println("Invalid Number");

            }
            scanner.nextLine();
        }
        System.out.println("Total is: " + inputSum);
        scanner.close();
    }
}
