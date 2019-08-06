package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        PRIMITIVE TYPES
        int myValue = 10000;

//        how to determine the range of a primitive type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(String.format("Integer Min: %d, Integer Max: %d",
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

        // int is the default number type in java
        // you can convert between numbers, where those
        //  numbers fit in the new type

        //casting:
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


//        FLOAT & DOUBLE
// float is a single-precision number, occupies 32 bits, width of 32
// double is a double-precision number, 64 bits, width 64


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(String.format("Float Min: %s, Float Max: %s",
                myMinFloatValue, myMaxFloatValue));


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(String.format("Double Min: %s, Double Max: %s",
                myMinDoubleValue, myMaxDoubleValue));

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myOtherFloatValue = (float) 5.25;
        // ^^ without the f you get an error; DOUBLE is the
        // default of these two floating-point types, same as
        // int's with whole numbers, so we must cast.
        // "f" is just nicer though...
        double myDoubleValue = 5d / 3d;
        // ^^ letters are optional but good practice
        System.out.println("int value: " + myIntValue);
        System.out.println("float value: " + myFloatValue);
        System.out.println("double value: " + myDoubleValue);
        // see how the outputs;
        // round for int
        // has half the decimal places on float
        // as it does for double

        // double is recommended above float; ironically faster

        // CHALLENGE:
        // convert lbs to kgs
        // 1lb = 0.45352937kg
        double poundsToKiloConversionRate = 0.45352937d;
        double poundsValue = 120d;
        double kilosValue = poundsValue * poundsToKiloConversionRate;
        System.out.println("Challenge Answer: " + kilosValue);

        // BigDecimal // for super-precise calculations there's
        //     this new class... see later chapters for more


//        CHAR & BOOLEAN
        char myChar = 'D';  // two bytes, 16-bits - allows unicode-charset
        // 65535 characters supported.  see unicode-table.com:
        char mySameChar = '\u0044';
        System.out.println("(heh) What size?... " + myChar + mySameChar);
        System.out.println("Cool symbols: " + '\u00A9');

        boolean myBoolean = true;







    }
}
