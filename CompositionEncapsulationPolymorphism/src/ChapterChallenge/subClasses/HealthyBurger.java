package ChapterChallenge.subClasses;

import ChapterChallenge.Burger;

public class HealthyBurger extends Burger {

    public HealthyBurger() {
        super("Healthy Burger", "brown rye", "beef", 4.99);
    }

    // brown rye bread, plus 2 extra additional items (6 total)


    @Override
    public void addExtra(String extraName, double extraPrice) {
        int extrasAdded = getExtrasAdded();
        if(extrasAdded < 4 ) {
            super.addExtra(extraName, extraPrice);
        } else {
            if(extrasAdded <= 6) {
                System.out.println("Adding the extras only allowed for Healthy Burger...");
                setExtrasAdded(++extrasAdded);
                setTotalPrice(getTotalPrice() + extraPrice);
            }

        }
    }
}
