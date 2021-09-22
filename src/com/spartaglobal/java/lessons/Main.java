package com.spartaglobal.java.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        // when making instances of constructors intellij, or any other editor, will identify which constructor you mean to use by matching the constructors parameters to the arguments passed in the instances of the said constructors. The constructors' parameters also have to be different regarding the number of arguments and their types.
//        // an object is an instance of a class
//
//        // below creates a policy variable and initialising it with a Policy object
//        Policy policyOne = new Policy(); // 1st new object made
//        System.out.println(policyOne);
//
//        // setting values of the instance fields using the setters of the class
//        policyOne.setType("Home");
//        policyOne.setMaxCover(1500.0);
////        policyOne.setPolicyHolder("Denies Neagu"); // delete if not needed during class as I have rewritten this better down below :)
//        policyOne.setPremium(30.0);
//
//        // uses boolean method in Policy class to answer this if/else condition
//        if (policyOne.processClaim(1300.0, "Set fire to sofa")) {
//            System.out.println("Claim accepted");
//        } else {
//            System.out.println("Claim rejected");
//        }
//
//        // (my question response...:)...)
//        // 2nd new object made
//        Policy policyTwo = new Policy(); // this object is using a 'zero-argument' or 'default' constructor as there are no arguments passed though the constructor. You get this for free from Java if none of your own constructors have been made
//        System.out.println(policyTwo.getPolicyHolder());// null is printed as nothing has been assigned to THIS policyHolder called on the 2nd new object
//        System.out.println(policyTwo.getPremium()); // 0.0 is the default value as there isn't a value present
//
//        // shows example of how the strings are set the same on different 'instances of the class' i.e. policyOne & policyTwo
//        policyOne.setPolicyHolder("Denies Neagu");
//        policyTwo.setPolicyHolder("Denies Neagu");
//        // '==' asks are they the same object
//        // .equals calls the .equals() method which returns a boolean
//        if (policyOne.equals(policyTwo)) {
//            System.out.println("The objects are the same");
//        } else {
//
//        }
//
//        // creating a constructor looses any free constructors form intellij
//        // the order of the arguments written in this 'instance of the constructor' is determined by the order the parameters in the constructor within the Policy class
//        Policy policyThree = new Policy(
//                "Car",
//                "Monica Taylor",
//                12.0,
//                1200.0,
//                null); // 3rd new object made
//        System.out.println(policyThree);
//
//        // instance of the subclass CarPolicy
//        CarPolicy tanyasPolicy = new CarPolicy(
//                "Car",
//                "Tanya",
//                123.0,
//                234000.0,
//                null,
//                new Vehicle());
//        tanyasPolicy.setMaxCover(45000.0);
//        tanyasPolicy.setTheCar(new Vehicle());
//        System.out.println(tanyasPolicy);
//        // policyTwo.setTheCar(new Vehicle) // would not work on Policy objects, only on CarPolicy objects
//
//        // declaring Policy class type whilst making an instance using the CarPolicy class
//        // inheritance describes an 'is a' relationship e.g.: a sports car 'is a' vehicle, an ArrayList 'is a' List etc.
//        // if you can read out loud the 'is a' relationship AND it makes sense, then it's correct to use it as an inheritance relationship in Java
//        // aka below: a CarPolicy 'is a' Policy, from the right-hand side to the left (read it that way :))
//        Policy staceyPolicy = new CarPolicy(
//                "Car",
//                "Stacey",
//                12.0,
//                123.0,
//                null,
//                new Vehicle());
//        System.out.println(staceyPolicy.getPolicyHolder());
//        // staceyPolicy.setTheCar(new Vehicle()); // can't access the CarPolicy class
//        // ((CarPolicy)staceyPolicy).setTheCar(new Vehicle()); // way to get around the error (this is called casting) from above HOWEVER it does come with errors/issues so... don't bother :D
//
//        // Wed Sep 22 15:05:17 BST 2021 - example output
//        Date date = new Date();
//        System.out.println(date);
//
//        // array of Policy classes (maybe instances of these)
//        ArrayList<Policy> thePolicies = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            if (Math.random() > 0.5) {
//                thePolicies.add(new LifePolicy());
//            } else {
//                thePolicies.add(new CarPolicy(
//                        "Car",
//                        "random",
//                        Math.random()*1000.0,
//                        Math.random()*10000.0,
//                        new Date(),
//                        new Vehicle()));
//            }
//        }
//        // iterates through arrayList
//        // compiler knows there will be a toString method
//        for (Policy p: thePolicies) {
//            System.out.println(p);
//        }


        // Bubble sorting solution::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        // array of ints for the argument value
        int intArray[] ={89, 7, 56, 2314, 78, 0, 145824, 4};

        // calls bubbleSort method to rearrange ints
        BubbleSort.bubbleSort(intArray);

        // Rectangle question::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        System.out.println("\n");

        // instances of rectangles classes made*
        Rectangle rectOne = new Rectangle(6,2);
        Rectangle rectTwo = new Rectangle(5,2);
        Rectangle rectThree = new Rectangle(2,2);
        Rectangle rectFour= new Rectangle(1,2);

        // empty arraylist of DOUBLES made - these are DOUBLES!!!
        ArrayList<Double> allRectangles = new ArrayList<>();

        // adding on instances made from earlier into the arraylist*
        allRectangles.add(rectOne.areaOfRectangle());
        allRectangles.add(rectTwo.areaOfRectangle());
        allRectangles.add(rectThree.areaOfRectangle());
        allRectangles.add(rectFour.areaOfRectangle());

        // calls the sorting method made to show the final (sorted) answer
        Rectangle.rectangleAngleSorter(allRectangles);

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
