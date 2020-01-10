package exercises;

public class Overloaded {

    public static void main(String[] args) {


    }

    public static double calculateFeedAndInchesToCentim(
            double feet, double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {

            double inchesFull = ( feet * 12D ) + inches;
            double cmRaw = inchesFull * 2.54D;

            return Math.round(cmRaw);

        } else {
            return -1D;
        }


    }

    public static double calculateFeedAndInchesToCentim(
            double inches) {

        if (inches >= 0) {

            double feet = inches / 12;
            double newInches = inches % 12;
            return calculateFeedAndInchesToCentim(feet, newInches);

        } else {
            return -1D;
        }


    }

}
