package ChapterChallenge;

import ChapterChallenge.subClasses.DeluxeBurger;
import ChapterChallenge.subClasses.HealthyBurger;

public class Main {

    public static void main(String args[]) {

//        Burger basicB = new Burger("Basic Burger", "white", "cow", 3.99);
//        basicB.addExtra("Onions", 0.99);
//        basicB.addExtra("Lettuce", 0.99);
////        basicB.printReceipt();
//        basicB.addExtra("Bacon", 1.99);
//        basicB.addExtra("Gherkin", 1.99);
//        basicB.addExtra("Ketchup", 1.99);
//
//        basicB.printReceipt();
//
//        System.out.println(" ==================================== ");

        Burger fancyPants = new HealthyBurger();
        fancyPants.addExtra("Peanut Butter", 0.99);
        fancyPants.addExtra("Jam", 0.99);
        fancyPants.addExtra("Extra Patty", 0.99);
        fancyPants.addExtra("Bacon", 1.99);
        fancyPants.addExtra("Cheese", 1.99);

        fancyPants.printReceipt();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addExtra("Onion", 0.99);
        deluxeBurger.printReceipt();

    }


}