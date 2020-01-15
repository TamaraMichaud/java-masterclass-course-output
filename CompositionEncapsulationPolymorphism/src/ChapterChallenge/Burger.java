package ChapterChallenge;

public class Burger {

    private String name;
    private String bread;
    private String meat;
    private double basePrice;
    private int extrasAdded;
    private double totalPrice;

    // ^^ & up to 4 other extras; lettuce, tomato, bacon, ketchup, onions, gherkin


    public Burger(String name, String bread, String meat, double basePrice) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = basePrice;
        this.extrasAdded = 0;
        this.totalPrice = 0;
    }

    public void addExtra(String extraName, double extraPrice) {
        if(extrasAdded == 4) {
            System.out.println("ERROR: already selected the maximum of 4 extras, unable to add more.");
        } else {
            System.out.println("Adding extra item " + extraName + " for £" + extraPrice);
            this.extrasAdded++;
            this.totalPrice += extraPrice;
        }
    }

    public void printReceipt(){

        String receiptText = String.format(" ---------------------------------------\n --- Bill's Burgers Bill ---\n" +
                " - Burger: %s     £%s\n", this.name, this.basePrice);
        totalPrice += basePrice;
        if(extrasAdded == 0) {
            receiptText += "  -- no extras ------   £-\n";
        } else {

            for (int i = 1; i <= extrasAdded ; i++) {

                receiptText += " - Extra item               £ ? \n";
                //TODO: ^^ improve this once we cover arrays/lists...
                //(course solution uses addItem1(), addItem2() etc... i can't do it)

            }

        }

        System.out.println(receiptText + "\n\n TOTAL:     £" + totalPrice + "\n ---------------------------------------");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getExtrasAdded() {
        return extrasAdded;
    }

    public void setExtrasAdded(int extrasAdded) {
        this.extrasAdded = extrasAdded;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
