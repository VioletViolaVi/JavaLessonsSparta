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
}
