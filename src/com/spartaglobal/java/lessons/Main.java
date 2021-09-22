package com.spartaglobal.java.lessons;

public class Main {
    public static void main(String[] args) {
        // when making instances of constructors intellij, or any other editor, will identify which constructor you mean to use by matching the constructors parameters to the arguments passed in the instances of the said constructors. The constructors' parameters also have to be different regarding the number of arguments and their types.
        // an object is an instance of a class

        // below creates a policy variable and initialising it with a Policy object
        Policy policyOne = new Policy(); // 1st new object made
        System.out.println(policyOne);

        // setting values of the instance fields using the setters of the class
        policyOne.setType("Home");
        policyOne.setMaxCover(1500.0);
//        policyOne.setPolicyHolder("Denies Neagu"); // delete if not needed during class as I have rewritten this better down below :)
        policyOne.setPremium(30.0);

        // uses boolean method in Policy class to answer this if/else condition
        if (policyOne.processClaim(1300.0, "Set fire to sofa")) {
            System.out.println("Claim accepted");
        } else {
            System.out.println("Claim rejected");
        }

        // (my question response...:)...)
        // 2nd new object made
        Policy policyTwo = new Policy(); // this object is using a 'zero-argument' or 'default' constructor as there are no arguments passed though the constructor. You get this for free from Java if none of your own constructors have been made
        System.out.println(policyTwo.getPolicyHolder());// null is printed as nothing has been assigned to THIS policyHolder called on the 2nd new object
        System.out.println(policyTwo.getPremium()); // 0.0 is the default value as there isn't a value present

        // shows example of how the strings are set the same on different 'instances of the class' i.e. policyOne & policyTwo
        policyOne.setPolicyHolder("Denies Neagu");
        policyTwo.setPolicyHolder("Denies Neagu");
        // '==' asks are they the same object
        // .equals calls the .equals() method which returns a boolean
        if (policyOne.equals(policyTwo)) {
            System.out.println("The objects are the same");
        } else {

        }

        // creating a constructor looses any free constructors form intellij
        // the order of the arguments written in this 'instance of the constructor' is determined by the order the parameters in the constructor within the Policy class
        Policy policyThree = new Policy(
                "Car",
                "Monica Taylor",
                12.0,
                1200.0,
                null); // 3rd new object made
        System.out.println(policyThree);




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
