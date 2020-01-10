package exercises;

public class LastDigitChecker {


    public static void main(String[] args) {


        System.out.println(hasSameLastDigit(41, 22, 71)); //t
        System.out.println(hasSameLastDigit(23, 32, 42)); //t
        System.out.println(hasSameLastDigit(9, 99, 999)); //f

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }

    private static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {

            int lastOne = numberOne % 10;
            int lastTwo = numberTwo % 10;
            int lastThree = numberThree % 10;

            return (lastOne == lastTwo || lastOne == lastThree || lastTwo == lastThree);
        }
        return false;
    }

    private static boolean isValid(int value) {
        return value >= 10 && value <= 1000;
    }


}
