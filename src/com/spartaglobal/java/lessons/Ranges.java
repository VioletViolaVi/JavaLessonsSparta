package com.spartaglobal.java.lessons;

public class Ranges {

    public static int sumRange(int startInt, int endInt) {
        // calculating sum of all ints from startInt to endInt
        int result = 0;
        if (endInt < startInt) {
            int tempStorage = startInt;
            startInt = endInt;
            endInt = tempStorage;
        }
        for (int i = startInt; i <= endInt; i++) {
            result += i;
        }
        return result;
    }
}
