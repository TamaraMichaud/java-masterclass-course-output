package exercises;

public class SharedDigit {

    public static void main(String[] args) {


        System.out.println(hasSharedDigit(12, 23)); //20
        System.out.println(hasSharedDigit(12, 43)); //20
        System.out.println(hasSharedDigit(9, 99)); //4
        System.out.println(hasSharedDigit(15, 55)); //-1

    }

    private static boolean hasSharedDigit(int numberOne, int numberTwo) {

        if(numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99) {

            char[] numberAsString = String.valueOf(numberOne).toCharArray();

            for(int i = 0; i < numberAsString.length; i++) {

                if(String.valueOf(numberTwo).contains(String.valueOf(numberAsString[i]))) {
                    return true;
                }
            }
        }
        return false;
    }
}
