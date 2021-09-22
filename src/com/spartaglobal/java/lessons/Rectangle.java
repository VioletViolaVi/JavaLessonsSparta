package com.spartaglobal.java.lessons;

import java.util.ArrayList;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(int lengthParam, int widthParam) {
        this.length = lengthParam;
        this.width = widthParam;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double areaOfRectangle() {
        return length * width;
    }

    public static void rectangleAngleSorter(ArrayList<Double> arrayListOfDoubles) {  // create another version to an array of rectangles
        //temporary holder; currently empty
        double tempHolder;
        // holds all angles in an arraylist
        ArrayList<Double> allRectanglesAngles = arrayListOfDoubles;

        // prints out all angles 1 by 1 b4 sorting
        System.out.println("Before sorting: ");
        for (double singleAngle : allRectanglesAngles) {
            System.out.println(singleAngle);
        }

        // actual sorting process
        for (int i = 0; i < arrayListOfDoubles.size(); i++) {
            for (int j = 0; j < arrayListOfDoubles.size(); j++) {
                if (arrayListOfDoubles.get(i) < arrayListOfDoubles.get(j)) {
                    tempHolder = arrayListOfDoubles.get(i);
                    arrayListOfDoubles.set(i, arrayListOfDoubles.get(j));
                    arrayListOfDoubles.set(j, tempHolder);
                }
            }
        }

        // After sorting printed:
        System.out.println("After sorting: ");
        for (double singleAngle: allRectanglesAngles) {
            System.out.println(singleAngle);
        }
    }







//        public static void rectangleAngleSort(ArrayList<Rectangle> rectangleArray) {
//            // create another version to an array of rectangles
//
//            //temporary holder; currently empty
//            Rectangle tempHolder;
//            // holds Rectangle arrayList inside
//            ArrayList<Rectangle> allRectangles = rectangleArray;
//
//            // prints out all Rectangle classes one by one
//            System.out.println("Before sorting: ");
//            for (Rectangle singleRectangle : allRectangles) {
//                System.out.println(singleRectangle);
//            }
//
//            // sorting process
//            for (int i = 0; i < allRectangles.size(); i++) {
//                for (int j = 1; j < allRectangles.size(); j++) {
//                    if (allRectangles.get(i) > allRectangles.get(j)) {
//                        tempHolder = allRectangles.get(i);
//                        allRectangles.get(i) = allRectangles.get(j);
//                        allRectangles.get(j) = tempHolder;
//                    }
//                }
//            }
//        }



//        public static void rectangleAngleSort(ArrayList<Rectangle> rectangleArray) {
//        // create another version to an array of rectangles
//        // sorts function solution
//        int arrayLength = rectangleArray.size();
//        int tempHolder = 0;
//        for (int i = 0; i < arrayLength; i++) {
//
//            for (int j = 1; j < (arrayLength - i); j++) {
//                if (rectangleArray[j - 1] > rectangleArray[j]) {
//                    //swapping elements
//                    tempHolder = rectangleArray[j - 1];
//                    rectangleArray[j - 1] = rectangleArray[j];
//                    rectangleArray[j] = tempHolder;
//                }
//            }
//        }
//    }


}
