package com.spartaglobal.java.lessons;

public class Ranges {

    public static int sumRange(int startInt, int endInt) {
        // calculating sum of all ints from startInt to endInt
        int result = 0;
        for (int i = startInt; i <= endInt; i++) {
            result += i;
        }
        return result;
    }
}
