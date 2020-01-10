package com.michaud.tamara.constructors;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }
}
