package exercises;

public class SpeedConverter {


    public static void main(String[] args) {
        //* toMilesPerHour(1.5); → should return value 1
        //* toMilesPerHour(10.25); → should return value 6
        //* toMilesPerHour(-5.6); → should return value -1
        //* toMilesPerHour(25.42); → should return value 16
        //* toMilesPerHour(75.114); → should return value 47

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    private static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1L;
        }

        double milesPerHour = kilometersPerHour * (1D / 1.609D);

        return Math.round(milesPerHour);
    }

    private static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {

            int milesPerHour = (int) toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h = " +
                    milesPerHour + " mi/h");
        }
    }

}
