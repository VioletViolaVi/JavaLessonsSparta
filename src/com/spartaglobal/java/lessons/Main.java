package com.spartaglobal.java.lessons;

public class Main {
    public static void main(String[] args) {
        // when making instances of constructors intellij, or any other editor, will identify which constructor you mean to use by matching the constructors parameters to the arguments passed in the instances of the said constructors. The constructors also have to be different regarding the number of arguments and their types.

        // an object is an instance of a class
        // below is creating a policy variable and initialising it with a Policy object
        Policy policyOne = new Policy(); // new object 1

        policyOne.setType("Home");
        policyOne.setMaxCover(1500.0);
        policyOne.setPolicyHolder("Denies Neagu");
        if (policyOne.processClaim(1300.0, "Set fire to sofa")) {
            System.out.println("Claim accepted");
        } else {
            System.out.println("Claim rejected");
        }

        // my question response...
        Policy policyTwo = new Policy(); // new object 2 is using the 'zero-argument' or 'default constructor' as there are no arguments passed though the constructor. You get this for free if none of your own constructers have been made
        // null is printed as nothing has been assigned to THIS policyHolder
        System.out.println(policyTwo.getPolicyHolder());
        // 0.0 default as no value is in the below:
        System.out.println(policyTwo.getPremium());

        policyTwo.setPolicyHolder("Denies Neagu");

        policyOne.setPremium(30.0);
        System.out.println(policyOne);

        // creating an constructor looses any free contrcutors form intlelji
        // the order of the values for the parameters will be defined by the order the parameters are present in the contsturotr
        Policy policyThree = new Policy(
                "Car",
                "Vivian Chinweze",
                12.0,
                1200.0,
                null); // object 3
        System.out.println(policyThree);

        // '==' asks are they the same object
        // .equals calls the .equals() method which returns a boolean
        if (policyOne.equals(policyTwo)) {
            System.out.println("The objects are the same");
        } else {

        }



/*
        // 21st September 2021:
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

        // my enums
        Enums.enumContinentsInfo();

        // auto boxing & auto unboxing
        Boxing.autoBoxing();
        Boxing.autoUnBoxing();

        // factorials
        System.out.println(Factorials.factorial(5));
        System.out.println(Factorials.factorialUsingLoops(4));

        // fibonaccis
        System.out.println(Fibonacci.fibonacci(8));
        System.out.println(Fibonacci.fibonacciLoops(8));

        // ranges
        System.out.println(Ranges.sumRange(1, 4)); // 10
        System.out.println(Ranges.sumRange(0, 0)); // 0
        System.out.println(Ranges.sumRange(20, 24)); // 110
        System.out.println(Ranges.sumRange(-2, 3)); // 3
        System.out.println(Ranges.sumRange(6, 6)); // 6
        System.out.println(Ranges.sumRange(8, 6)); // 6
        System.out.println("HERE: " + Ranges.sumRange(3, 1)); // 0
        Ranges.swapIntsWhenInWrongOrder(10, 5);
        Ranges.swapIntsWhenInWrongOrder(3, 1);

        // 22nd September 2021:
 */
    }
}
