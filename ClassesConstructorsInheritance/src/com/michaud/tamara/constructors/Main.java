package com.michaud.tamara.constructors;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("0192834573", 500,
                "Some Person", "email@address.whatever", "071234567903");

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point point = new Point();
        System.out.println(point.distance());


    }
}
