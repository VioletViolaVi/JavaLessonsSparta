package com.spartaglobal.java.lessons;

public class Ranges {

    public static int sumRange(int startInt, int endInt) {
        // calculating sum of all ints from startInt to endInt
        int result = 0;
        if (endInt < startInt) {
            swapIntsWhenInWrongOrder(startInt, endInt);
        }
        for (int i = startInt; i <= endInt; i++) {
            result += i;
        }
        return result;
    }

    public static void swapIntsWhenInWrongOrder(int firstNum, int secondNum) {
        System.out.println("Before swap firstNum = " + firstNum + " secondNum = " + secondNum);
        int tempStorage = firstNum;
        firstNum = secondNum;
        secondNum = tempStorage;
        System.out.println("After swap firstNum = " + firstNum + " secondNum = " + secondNum);
    }
}
