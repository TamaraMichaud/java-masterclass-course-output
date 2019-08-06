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

        // you can use "_"s in a literal int to make it readable

//        BYTES AND SHORTS
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(String.format("Byte Min: %d, Byte Max: %d",
                myMinByteValue, myMaxByteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(String.format("Short Min: %d, Short Max: %d",
                myMinShortValue, myMaxShortValue));


        // byte = 8-bits and has a width of 8
        // short = 16-bits and has a width of 16
        // int = 32-bits and has a width of 32
        // long = 64-bits and has a width of 64; size 2^63

        long myExampleLongLiteral = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(String.format("Long Min: %d, Long Max: %d",
                myMinLongValue, myMaxLongValue));
        System.out.println("My long literal value is: " + myExampleLongLiteral);

//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println(String.format("Double Min: %d, Double Max: %d",
//                myMinDoubleValue, myMaxDoubleValue));
// OOPS! ^^ this is a bit messy... science-y stuff methinks

//OUTPUT:
        //Minimum Size: -2147483648, Maximum Size: 2147483647
        //Busted MAX: -2147483648
        //Byte Min: -128, Byte Max: 127
        //Short Min: -32768, Short Max: 32767
        //Long Min: -9223372036854775808, Long Max: 9223372036854775807
        //My long literal value is: 100

        // int is the default number type in java
        // you can convert between numbers, where those
        //  numbers fit in the new type

        byte myNewByte = (byte) (myMinByteValue / 2);
        // ^^ java automatically wants to convert the MinByte to
        //  an int, so we must cast explicitly

//        CASTING CHALLENGE

        byte validByte = 120;
        short validShort = -30_001;
        int validInt = 21419000;
        long myLong = 50000L + (
                10L * (
                        validByte + validShort + validInt
                    ));
// ^^ no casting required because all int's (the assumed default)
        // fit into longs....  try this with a short and see the
        // difference
        System.out.println("Challenge Answer: " + myLong);









    }
}
