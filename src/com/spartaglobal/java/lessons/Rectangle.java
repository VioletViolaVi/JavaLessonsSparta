package com.spartaglobal.java.lessons;

import java.util.ArrayList;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int lengthParam, int widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    public int areaOfRectangle() {
        return length * width;
    }

    public static void rectangleAngleSorter(ArrayList<Integer> arrayListOfIntegers) {  // create another version to an array of rectangles
        //temporary holder; currently empty
        int tempHolder;
        // holds all angles in an arraylist
        ArrayList<Integer> allRectanglesAngles = arrayListOfIntegers;

        // prints out all angles 1 by 1 b4 sorting
        System.out.println("Before sorting rectangle angles: ");
        for (int singleAngle : allRectanglesAngles) {
            System.out.print(singleAngle + ", ");
        }
        System.out.println();

        // actual sorting process
        for (int i = 0; i < arrayListOfIntegers.size(); i++) {
            for (int j = 0; j < arrayListOfIntegers.size(); j++) {
                if (arrayListOfIntegers.get(i) < arrayListOfIntegers.get(j)) {
                    tempHolder = arrayListOfIntegers.get(i);
                    arrayListOfIntegers.set(i, arrayListOfIntegers.get(j));
                    arrayListOfIntegers.set(j, tempHolder);
                }
            }
        }

        // After sorting printed:
        System.out.println("After sorting rectangle angles: ");
        for (int singleAngle: allRectanglesAngles) {
            System.out.print(singleAngle + ", ");
        }
        System.out.println();
    }
}
