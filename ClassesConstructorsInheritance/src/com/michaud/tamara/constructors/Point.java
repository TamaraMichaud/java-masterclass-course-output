package com.michaud.tamara.constructors;

public class Point {  // , what is the...

    private int x;
    private int y;

    public Point(){
        this(4, 9);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // distance between two points   A(xA, yA) and B(xB, yB)
    // d(A, B) = SQRT (xB - xA) * (xB - xA) + (yB - yA) * (yB - yA)

    public double distance() {

      return distance(0,0);  // distance from (0,0)
    }

    public double distance(int xB, int yB){
        // distance from this. and (otherX, otherY)

        int xA = this.x;
        int yA = this.y;

        return Math.sqrt( (xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

    }

    public double distance(Point otherPoint) {
        // distance from this. and otherPoint
        return distance(otherPoint.getX(), otherPoint.getY());
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
