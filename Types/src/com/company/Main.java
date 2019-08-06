package com.company;

public class Main {

    public static void main(String[] args) {

//        PRIMITIVE TYPES
        int myValue = 10000;

//        how to determine the range of a primitive type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(String.format("Minimum Size: %d, Maximum Size: %d",
                myMinIntValue, myMaxIntValue));

        System.out.println("Busted MAX: " + (myMaxIntValue + 1));
        // ^^ this produces an "overflow" and loops over to a minus number
        // ^^ the same with a number smaller than the minimum; you get
        //    an "underflow"

//output:
//          Minimum Size: -2147483648, Maximum Size: 2147483647
//          Busted MAX: -2147483648

    }
}
