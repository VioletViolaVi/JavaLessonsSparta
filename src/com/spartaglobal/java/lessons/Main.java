package com.spartaglobal.java.lessons;

public class Main {
    public static void main(String[] args) {

        // palindrome (spelt same either way round)
        Palindrome.palindromeSentence("hello");
        Palindrome.palindromeSentence("madam");

        // my java methods
        JavaMethods.substringMethod("pizza", 0, 3); // cuts 'pizza' string in part
        JavaMethods.splitMethod("Ha,ppy,Birth,day", ", ");
        JavaMethods.matchMethod("SE15 2PH", "[A-Z]{2}[0-9]{2}\\s+[0-9][A-Z]{2}");
        JavaMethods.compareMethod("Raven", "Baxter"); // +ve value indicates that Baxter is longer than Raven
        JavaMethods.compareMethod("Baxter", "Cory"); // -ve value indicates that Cory is shorter than Baxter
        JavaMethods.compareMethod("Cory", "Cory"); // zero value indicates that Cory is the same length as Cory
        JavaMethods.containsMethod("Waterfall", "Water");
        JavaMethods.indexOfMethod("Noodles", 'q');


    }
}
