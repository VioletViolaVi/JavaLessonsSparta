package com.spartaglobal.java.lessons;

public class Boxing {
    // deprecated indication
    public static Integer myInteger = new Integer(23);

    // auto-unboxing object -> primitive
    public static void autoBoxing(){
        int myInt = myInteger;
        System.out.println(myInt);
    }

    // auto boxing: primitive -> object
    public static void autoUnBoxing(){
        myInteger = 46;
        System.out.println(myInteger);
    }
}
