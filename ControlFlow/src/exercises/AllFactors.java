package exercises;

public class AllFactors {


    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }


    public static void printFactors(int number) {

        if(number < 1 ) {
            System.out.println("INVALID VALUE");
        }

        String factorsList = "";
        for(int i = 1; i <= number; i++){

            if(number % i == 0) {
                factorsList += i + " ";
            }
//            if(number % i == 0 && i > 1) {
//                factorsList += ", ";
//            }
        }

//        System.out.println(factorsList + " - are factors of " + number);
        System.out.println(factorsList);
    }

}
