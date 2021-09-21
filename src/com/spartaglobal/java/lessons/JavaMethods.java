package com.spartaglobal.java.lessons;

public class JavaMethods {
    // substring method
    public static void substringMethod(String str, int firstIndex, int lastIndex) {
        System.out.println(str.substring(firstIndex, lastIndex));
    }

    // split method
    public static void splitMethod(String str, String wayOfSplit) {
        System.out.println(str.split(wayOfSplit));
    }

    // matches method
    public static void matchMethod(String str, String regexStr) {
        System.out.println(str.matches(regexStr));
    }

    // compares method
    public static void compareMethod(String str1, String str2) {
        System.out.println(str1.compareTo(str2));
    }

    // contains method
    public static void containsMethod(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }

    // indexOf method
    public static void indexOfMethod(String str, char letter) {
        System.out.println(str.indexOf(letter));
    }
}
