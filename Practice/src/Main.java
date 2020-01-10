public class Main {

    public static void main(String[] args) {


//        System.out.println(isPalindrome(12345));
//        System.out.println(isPalindrome(12321));
//        System.out.println(isPalindrome(995599));
//        System.out.println(isPalindrome(-222));

//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

            System.out.println(getEvenDigitSum(123456789)); //20
            System.out.println(getEvenDigitSum(252)); //4
            System.out.println(getEvenDigitSum(-22)); //-1




        }

        public static boolean isPalindrome(int number) {

            if(number < 0) {number *= -1;}
            //how to reverse a number
// treat it like a string...
            String cheater = "" + number;
            String reverse = "";
            for(char woo : cheater.toCharArray()){
                reverse = new StringBuilder().append(woo).append(reverse).toString();
            }
            return reverse.equals("" + number);

// or the maths way...
            // % 10 then add it * 10
//        int reverse = 0;
//        int origNumber = number;
//        while (number > 0) {
//
//            int lastDigit = number % 10;
//            reverse *= 10;
//            reverse += lastDigit;
//            number /= 10;
//        }
//        return reverse == origNumber;

        }

        public static int sumFirstAndLastDigit(int number){

            if (number < 0) {
                return -1;
            }
            int lastDigit = number % 10;
            int firstDigit = 0;
            while (number > 0) {
                firstDigit = number % 10;
                number /= 10;
            }

            return firstDigit + lastDigit;
        }


        public static int getEvenDigitSum(int number) {

            if(number < 0) {
                return -1;
            }
            int sumEvenDigits = 0;
            while (number > 0) {
                int nextNumber = number % 10;
                if (nextNumber % 2 == 0) {
                    sumEvenDigits += nextNumber;
                }
                number /= 10;
            }

            return sumEvenDigits;
        }


    }
