package encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;

        if(tonerLevel == -1) {
            throw new RuntimeException("WHAT ARE YOU DOING! Printer toner level must be between 0 and 100%... we recommend 100 to start with...");
        }

        String duplexMsg = (isDuplex) ? "duplex" : "";
        System.out.println("Welcome to your BRAND NEW " + duplexMsg + " printer!");
        System.out.println(" ---------------------------- ");
        System.out.println("Toner Level:   " + tonerLevel + "%");
        System.out.println("Print History: " + pagesPrinted + " pages");
        System.out.println(" ---------------------------- ");
    }

    public void fillToner() {

        if (tonerLevel >= 90) {
            System.out.println("Toner is full enough; use some before trying to top up further");
        } else {
            System.out.println("Toner level is at " + this.tonerLevel + "%");
            System.out.println("Need to add: " + (100 - this.tonerLevel) + "%");
            this.tonerLevel = 100;
            System.out.println("Toner topped up....");
        }
    }


    private boolean consumeToner(int pagesOfToner) {

        double tonerRequired = pagesOfToner * 0.3;

        if (tonerRequired > this.tonerLevel) {
            return false;
        } else {
            this.tonerLevel -= tonerRequired;
            return true;
        }
    }

    public void printPages(int numberPages) {

        if (!consumeToner(numberPages)) {
            System.out.println("Not enough toner available!");

            fillToner();

        }

        System.out.println(String.format("Printing %d pages...", numberPages));
        if (isDuplex) {
            pagesPrinted += (numberPages / 2) + (numberPages % 2);
        } else {
            pagesPrinted += numberPages;
        }
        System.out.println("Print History Updated: " + pagesPrinted + " pages");

        System.out.println("Toner level now at: " + tonerLevel + "%");
    }


}
