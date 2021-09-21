package com.spartaglobal.java.lessons;

public class Fibonacci {

    /*
        - 0, 1, 1, 2, 3, 5, 8, 13, 21, 33, 54, etc.
        - always start with 0, 1,
        - add last two numbers to get next number
    */

    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    
    public static int fibonacciLoops(int num) {
        int firstVal = 0;
        int secondVal = 1;
        int sum = firstVal + secondVal;

        while (num > 1) {
            sum = firstVal + secondVal;
            firstVal = secondVal;
            secondVal = sum;
            num--;
        }
        return sum;
    }


}
