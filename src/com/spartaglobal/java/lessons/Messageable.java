package com.spartaglobal.java.lessons;

// interfaces can have static variables but not non-static variables
public interface Messageable {
     void sendMessage();
     default void someFunction(){
         System.out.println("do something");
     }
     static void anotherFunction(){
         System.out.println("Static function");
     }
}
