package com.spartaglobal.java.lessons;

public class BubbleSort {
    public static void bubbleSort(int[] intArray) {
        // sorts function solution
        int arrayLength = intArray.length;
        int tempHolder = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < (arrayLength - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    //swapping elements
                    tempHolder = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = tempHolder;
                }
            }
        }
    }
}
