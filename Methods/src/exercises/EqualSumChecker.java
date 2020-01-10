package exercises;

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasEqualSum(int first,
                                      int second,
                                      int third) {

        return (first + second == third);
    }

    public static boolean hasTeen(int one, int two,
                                  int three) {

        int[] asArray = {one, two, three};
        for (int value : asArray) {
            if (isTeen(value)) {
                return true;
            }
        }
        return false;

    }

    public static boolean isTeen(int value) {
        if (value >= 13 && value <= 19) {
            return true;
        }
        return false;
    }


}
