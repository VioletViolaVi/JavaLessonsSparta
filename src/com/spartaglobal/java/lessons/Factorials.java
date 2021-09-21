package com.spartaglobal.java.lessons;

public class Factorials {
    /*
        5! = 5 * 4 * 3 * 2 * 1
        5! == 5 * 4!
        5! == 5 * 4 * 3!
        5! == 5 * 4 * 3 * 2! - stop here using Base Case, so it halts at 1 i.e: '2 * 1'
    */
    public static int factorial(int num) {
        if (num == 1) {
            System.out.println("factorial(" + num + ") returns: 1"); // to help see what's happening
            return 1;
        } else {
            System.out.println("factorial(" + num + ") returns: " + num + " * factorial(" + (num - 1) + ")"); // to help see what's happening
            return num * factorial(num - 1);
        }
    }
}
