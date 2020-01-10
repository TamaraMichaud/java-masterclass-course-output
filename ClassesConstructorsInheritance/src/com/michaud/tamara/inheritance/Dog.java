package com.michaud.tamara.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coatType;

//    public Dog(String name, int brain, int body, int size, int weight) {   // TODO: we dont need to define all attributes; e.g. some are always true
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coatType) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coatType = coatType;
    }

    @Override
    public void eat() {
        System.out.println("This dog wants to tell us that he's eating before he eats just like any other animal...");
        super.eat();
    }

    public void wagTail(){
        System.out.println("when the dog wags his tail, he moves around...");
        //move(); // << DONT DO THIS!! currently we are calling "super.move()" so; type "super.move()"
        // ^^ otherwise if we override move() later, this method will start to call the wrong one!!
        super.move();
    }

    public void run(){

        // here we'd want the dog to move() faster; so perhaps now we'll create an overridden method to make this happen...
        // different from the super.move() in wagTail() above.
    }

}
