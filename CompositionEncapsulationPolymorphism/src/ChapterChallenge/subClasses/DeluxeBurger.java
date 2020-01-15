package ChapterChallenge.subClasses;

import ChapterChallenge.Burger;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe Burger", "white", "beef", 8.99);
        super.addExtra("Chips", 0.0);
        super.addExtra("Drink", 0.0);
    }

    // no extra additions, but comes with chips and drink.
    //find a way to add these additions at the point of creation, and then prevent other additions being made


    @Override
    public void addExtra(String extraName, double extraPrice) {
        System.out.println("ERROR: cannot add extras to this burger");
    }
}
