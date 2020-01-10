package exercises;

public class LeapYearCalculator {

    public static void main(String[] args) {

        //not leap
//        int[] years = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600};
        //leap
//        int[] years = {1600, 2000, 2400};
        //challenge years
        int[] years = {-1600, 1600, 2017, 2000};


        for (int i = 0; i < years.length; i++) {

            int year = years[i];
            System.out.println("Year: " + year + ", " +
                    isLeapYear(year));
        }
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }


}
