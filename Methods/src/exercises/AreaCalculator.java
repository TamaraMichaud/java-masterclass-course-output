package exercises;

public class AreaCalculator {


    public static void main(String[] args) {

        System.out.println("area(5.0): " + area(5.0));
        System.out.println("area(-1): " + area(-1));
        System.out.println("area(5.0, 4.0): " + area(5.0, 4.0));
        System.out.println("area(-1.0, 4.0): " + area(-1.0, 4.0));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1D;
        }
        double pi = 3.14159;
        return pi * (radius * radius);
    }

    public static double area(double leftSide,
                              double rightSide) {

        if (leftSide < 0 || rightSide < 0) {
            return -1D;
        }
        return leftSide * rightSide;
    }
}
