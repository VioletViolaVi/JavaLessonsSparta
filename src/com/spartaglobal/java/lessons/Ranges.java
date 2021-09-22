package com.spartaglobal.java.lessons;

public class Ranges {
/*

    // private instant fields
    private static int first;
    private static int second;

    // constructor
    public Ranges(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // getters
    public static int getFirst() {
        return first;
    }
    public static int getSecond() {
        return second;
    }

*/

    public static int sumRange(int startInt, int endInt) {
        // calculating sum of all ints from startInt to endInt
        int result = 0;
        if (endInt < startInt) {
            // added IntPair referencing
            IntPair thePair = swapIntsWhenInWrongOrder(startInt, endInt);
            // added due to IntPair getters
            startInt = thePair.getFirst();
            endInt = thePair.getSecond();
        }
        for (int i = startInt; i <= endInt; i++) {
            result += i;
        }
        return result;
    }

    // changed from void to IntPair type
    public static IntPair swapIntsWhenInWrongOrder(int firstNum, int secondNum) {
        // below added via IntPair
        IntPair intPair = new IntPair(firstNum, secondNum);
        return intPair;
        /*  (the below is no longer needed in order to fix the scoping issue of not returning 0):
            System.out.println("Before swap firstNum = " + firstNum + " secondNum = " + secondNum);
            int tempStorage = firstNum;
            firstNum = secondNum;
            secondNum = tempStorage;
            System.out.println("After swap firstNum = " + firstNum + " secondNum = " + secondNum);
         */
    }
}
