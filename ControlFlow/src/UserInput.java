import java.util.Calendar;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");


        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();


            scanner.nextLine(); // this is because we hit return after
            // we input the number; so "nextLine" is already populated.
            // only nextLine can correctly understand the return key
            int yearToday = Calendar.getInstance().get(Calendar.YEAR);
            int age = yearToday - yearOfBirth;
            String ageSlur;
            if (age < 0 || age > 120) {
                ageSlur = "Woah, you must be alien or sutin; " + age +
                        " years old!";
            } else if (age < 18) {
                ageSlur = "Heya kiddo, just a baby at " + age + " years old";
            } else {
                ageSlur = "Pah, loser's " + age + " years old...";

            }

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();


            System.out.println("Thanks, Hi " + name +
                    ageSlur);
        } else {
            System.out.println("Silly dummy; that wasn't a number...");
        }
        scanner.close();

    }


}
