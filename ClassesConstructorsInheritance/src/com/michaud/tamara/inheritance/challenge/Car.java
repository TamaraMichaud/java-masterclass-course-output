package com.michaud.tamara.inheritance.challenge;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
