package com.company;

/**
 * Created by fishes on 3/18/2017.
 */
public class WideningCasting {

    public static byte byte1 = 127;
    public static short short1 = 0;
    public static int int1 = 0;
    public static long long1 = 0L;
    public static float float1 = 0.0f;
    public static double double1 = 0.0d;
    public String name;

//correct conversion 64f<=32f<=64<=32<=16<=8

    public static void widening() {
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println("double1 =" + double1);

    }

}


