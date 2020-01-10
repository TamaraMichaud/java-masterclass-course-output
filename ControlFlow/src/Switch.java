public class Switch {

    public static void main(String[] args) {
        int days[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int day : days) {
            printDayOfTheWeek(day);

        }
    }

    private static void printDayOfTheWeek(int day) {

        String dayText;
        switch (day) {

            case 1:
                dayText = "Monday";
                break;
            case 2:
                dayText = "Tuesday";
                break;
            case 3:
                dayText = "Wednesday";
                break;
            case 4:
                dayText = "Thursday";
                break;
            case 5:
                dayText = "Friday";
                break;
            case 6:
                dayText = "Saturday";
                break;
            case 7:
                dayText = "Sunday";
                break;

            default:
                System.out.println("Invalid day");
                return;
        }
        System.out.println(dayText);
    }


}
