package exercices;

public class NumberInWord {

    public static void main(String[] args) {

    }

    public static void printNumberInWord(int number) {

        if (number < 0 || number > 9) {
            System.out.println("OTHER");
        } else {
            String result;
            switch (number) {

                case 0:
                    result = "ZERO";
                    break;
                case 1:
                    result = "ONE";
                    break;
                case 2:
                    result = "TWO";
                    break;
                case 3:
                    result = "THREE";
                    break;
                case 4:
                    result = "FOUR";
                    break;
                case 5:
                    result = "FIVE";
                    break;
                case 6:
                    result = "SIX";
                    break;
                case 7:
                    result = "SEVEN";
                    break;
                case 8:
                    result = "EIGHT";
                    break;
                case 9:
                    result = "NINE";
                    break;
                default:
                    result = "OTHER";
            }
            System.out.println(result);
        }
    }

    // number days in Month
    public static boolean isLeapYear(int year){
        if(year < 1 || year >9999 ){
            return false;
        } else{

            //we've literally just done this... no thanks
        }
        return false;
    }


}
