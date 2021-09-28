package com.spartaglobal.java.lessons;

import java.text.DateFormat;
import java.text.ParseException;

public class ExceptionsWorker {
    // throws ParseException (was in signature)// added throws ParseException
    void myFunc() throws ParseException, MyException  {
        // exceptions (ExceptionsDriver)
        int a = 10;
        int b = 0;

        System.err.println("Hello"); // shows in terminal in red

        DateFormat df = DateFormat.getDateInstance();
        int c = a/b;
        System.out.println(c);

        try{
            // *open a file - could cause an exception, still want to close the file
            // *read from the file - could cause an exception as well, still want to close the file
            throw new ArithmeticException("Hello there! From my method!");
//            System.out.println(df.parse("2021-09-28"));
//            System.out.println(df.parse("This is after the parse"));
//        } catch (ParseException e){
            // don't print using System.out.println() for the below:
//            e.printStackTrace(); // 'hanging offence' if you don't do anything with the exception block aka. never do that!
        } finally{
            // *closing the file occurs here
            System.out.println("This got executed regardless of the above try & catch blocks");
        }
    }
}
