package encapsulation;

// this is the challenge exercise...
public class Main {

    public static void main(String args[]) {

        Printer myPrinter = new Printer(60, false);
        myPrinter.printPages(83);
        myPrinter.printPages(35);
        myPrinter.printPages(66);
        myPrinter.printPages(18);

    }
}


