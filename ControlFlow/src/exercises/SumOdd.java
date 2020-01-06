package exercises;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number){

        if(number > 0){

            if(number % 2 == 0){
                return false;
            } else {
//                System.out.println("Number " + number + " is odd.");
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        if(start < 0 || end < 0 || end < start){
            return -1;
        }
        int sumValue = 0;
        for(int i = start; i <= end; i++){

            if(isOdd(i)){
                sumValue += i;
            }
        }
        return sumValue;
    }
}
