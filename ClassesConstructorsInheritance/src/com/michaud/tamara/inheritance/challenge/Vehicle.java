package com.michaud.tamara.inheritance.challenge;

public class Vehicle {

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int currentVelocity, int currentDirection) {
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Steering angle now: " + currentDirection);
    }
    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void brake() {
        this.currentVelocity = 0;
    }
}
