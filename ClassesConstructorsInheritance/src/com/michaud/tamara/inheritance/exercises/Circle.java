package com.michaud.tamara.inheritance.exercises;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;   // pi r ^2
    }


    public double getRadius() {
        return radius;
    }

}

