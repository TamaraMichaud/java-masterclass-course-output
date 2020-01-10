package exercises;

public class GreatestCommonDivisor {


    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10) {
            return -1;
        }

        int divisor = Math.min(first, second);

        while(divisor > 0) {

            if(first % divisor == 0){
                if(second % divisor == 0) {
                    return divisor;
                }
            };
            divisor--;
        }

        return -1;
    }



}
