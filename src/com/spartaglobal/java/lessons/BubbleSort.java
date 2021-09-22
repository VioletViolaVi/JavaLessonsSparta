package com.spartaglobal.java.lessons;

public class BubbleSort {
    public static void bubbleSort(int[] intArray) {
        // length of array
        int intArrayLength = intArray.length;
        // currently, empty int variable
        int tempHolder;

        // prints ints before sorting
        System.out.println("Before bubbleSort: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();

        // checking 2 ints at a time to put in ascending order
        for (int i = 0; i < intArrayLength; i++) {
            for (int j = 0; j < intArrayLength; j++) {
                if (intArray[i] < intArray[j]) {
                    tempHolder = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tempHolder;
                }
            }
        }

        // prints ints after sorting
        System.out.println("After bubbleSort: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();
    }
}
