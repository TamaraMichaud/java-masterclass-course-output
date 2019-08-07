package exercises;

public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }

    public static boolean areEqualByThreeDecimalPlaces(double first,
                                                       double next){

        int compareFirst = (int) (first * 1000);
        int compareNext = (int) (next * 1000);

        return compareFirst == compareNext;
    }
}
