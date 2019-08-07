package exercises;

public class LastThreeExercises {

    public static void main(String[] args) {
//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);
//        printEqual(1, 1, 1);
//        printEqual(1, 1, 2);
//        printEqual(-1, -1, -1);
//        printEqual(1, 2, 3);
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    //minutes to years and days calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            int allDays = (int) minutes / 60 / 24;
            int years = allDays / 365;
            int days = allDays % 365;

            System.out.println(String.format("%s min = %d y and %d d",
                    minutes, years, days));
        }
    }

    //equality printer
    public static void printEqual(int one, int two, int three){

        if(one < 0 || two < 0 || three < 0){
            System.out.println("Invalid Value");
        } else if(one == two && two == three){
            System.out.println("All numbers are equal");
        } else if(one != two && two != three && one != three){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    //playing cat
    public static boolean isCatPlaying(boolean summer, int temperature){

        if(temperature >= 25 && (temperature <= 35 ||
                (summer && temperature <=45))){
            return true;
        }
        return false;
    }

}
