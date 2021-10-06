package com.spartaglobal.java.lessons;

public class Main {
    public static void main(String[] args) {

/*

        // 21st September 2021: ////////////////////////////////////////////////////////////////////////////////////////
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


        // 22nd September 2021: ////////////////////////////////////////////////////////////////////////////////////////

        // note1: when making instances of constructors intellij, or any other editor, will identify which constructor you mean to use, by matching the constructors parameters to the arguments passed in the instances of the said constructors. The constructors' parameters also have to be different regarding the number of arguments and their types.
        // note2: an object is an instance of a class

        // below creates a policy variable and initialising it with a Policy object
        Policy policyOne = new Policy(); // 1st new object made
        System.out.println(policyOne);

        // setting values of the instance fields using the setters of the class
        policyOne.setType("Home");
        policyOne.setMaxCover(1500.0);
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

        // instance of the subclass CarPolicy
        CarPolicy tanyaPolicy = new CarPolicy(
                "Car",
                "Tanya",
                123.0,
                234000.0,
                null,
                new Vehicle());
        tanyaPolicy.setMaxCover(45000.0);
        tanyaPolicy.setTheCar(new Vehicle());
        System.out.println(tanyaPolicy);

        // policyTwo.setTheCar(new Vehicle) // would not work on Policy objects, only on CarPolicy objects

        // declaring Policy class type whilst making an instance using the CarPolicy class
        // inheritance described an 'is a' relationship e.g.: a sports car 'is a' vehicle, an ArrayList 'is a' List etc.
        // if you can read out loud the 'is a' relationship AND it makes sense, then it's correct to use it as an inheritance relationship in Java
        // aka below: a CarPolicy 'is a' Policy, from the right-hand side to the left (read it that way :))
        Policy staceyPolicy = new CarPolicy(
                "Car",
                "Stacey",
                12.0,
                123.0,
                null,
                new Vehicle());
        System.out.println(staceyPolicy.getPolicyHolder());

        // staceyPolicy.setTheCar(new Vehicle()); // can't access the CarPolicy class
        // ((CarPolicy)staceyPolicy).setTheCar(new Vehicle()); // way to get around the above error (this is called casting) HOWEVER it does come with errors/issues so... don't bother :P

        // Wed Sep 22 15:05:17 BST 2021 - example output
        Date date = new Date();
        System.out.println(date);

        // array of Policy classes (maybe instances of these)
        ArrayList<Policy> thePolicies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                thePolicies.add(new LifePolicy());
            } else {
                thePolicies.add(new CarPolicy(
                        "Car",
                        "random",
                        Math.random()*1000.0,
                        Math.random()*10000.0,
                        new Date(),
                        new Vehicle()));
            }
        }
        // iterates through arrayList
        // compiler knows there will be a toString method
        for (Policy p: thePolicies) {
            System.out.println(p);
        }

        // Assignment 1 - Bubble sorting solution::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        // instances of bubbleSorter made
        BubbleSort bubbleSort1 = new BubbleSort(89);
        BubbleSort bubbleSort2 = new BubbleSort(7);
        BubbleSort bubbleSort3 = new BubbleSort(56);
        BubbleSort bubbleSort4 = new BubbleSort(2314);
        BubbleSort bubbleSort5 = new BubbleSort(78);
        BubbleSort bubbleSort6 = new BubbleSort(0);
        BubbleSort bubbleSort7 = new BubbleSort(145824);
        BubbleSort bubbleSort8 = new BubbleSort(4);

        // empty arraylist of INTEGERS made - these are INTEGERS!!!
        ArrayList<Integer> allNumbers = new ArrayList<>();

        // adding on instances into the arraylist
        allNumbers.add(bubbleSort1.getAnyNum());
        allNumbers.add(bubbleSort2.getAnyNum());
        allNumbers.add(bubbleSort3.getAnyNum());
        allNumbers.add(bubbleSort4.getAnyNum());
        allNumbers.add(bubbleSort5.getAnyNum());
        allNumbers.add(bubbleSort6.getAnyNum());
        allNumbers.add(bubbleSort7.getAnyNum());
        allNumbers.add(bubbleSort8.getAnyNum());

        // (to keep code DRY I used the Random class and a for loop instead) produces random num between 0 - 100 inclusively then adds it to arraylist
        // random numbers
        Random random = new Random();

        for(int i = 0; i < 8; i++){
            BubbleSort bubbleSort = new BubbleSort(random.nextInt(101));
            allNumbers.add(bubbleSort.getAnyNum());
        }

        // calls the sorting method made to show the final (sorted) answer
        BubbleSort.bubbleSorter(allNumbers);


        // Assignment 2 - Rectangle question::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        // instances of rectangles classes made*
        Rectangle rectOne = new Rectangle(188,2);
        Rectangle rectTwo = new Rectangle(50,89);
        Rectangle rectThree = new Rectangle(6,7);
        Rectangle rectFour= new Rectangle(20,8);

        // empty arraylist of INTEGERS made - these are INTEGERS!!!
        ArrayList<Integer> allRectangles = new ArrayList<>();

        // adding on instances made from earlier into the arraylist*
        allRectangles.add(rectOne.areaOfRectangle());
        allRectangles.add(rectTwo.areaOfRectangle());
        allRectangles.add(rectThree.areaOfRectangle());
        allRectangles.add(rectFour.areaOfRectangle());

        // calls the sorting method made to show the final (sorted) answer
        System.out.println("\n");
        Rectangle.rectangleAngleSorter(allRectangles);


        // 23rd September 2021: ////////////////////////////////////////////////////////////////////////////////////////
        // note1: when making instances of constructors intellij, or any other editor, will identify which constructor you mean to use, by matching the constructors parameters to the arguments passed in the instances of the said constructors. The constructors' parameters also have to be different regarding the number of arguments and their types.
        // note2: an object is an instance of a class

        // below creates a policy variable and initialising it with a Policy object
        Policy policyOne = new Policy() {
            @Override
            public boolean processClaim(double claimAmount, String claimReason) {
                return false;
            }
        }; // 1st new object made
        System.out.println(policyOne);

        // setting values of the instance fields using the setters of the class
        policyOne.setType("Home");
        policyOne.setMaxCover(1500.0);
        policyOne.setPremium(30.0);

        // uses boolean method in Policy class to answer this if/else condition
        if (policyOne.processClaim(1300.0, "Set fire to sofa")) {
            System.out.println("Claim accepted");
        } else {
            System.out.println("Claim rejected");
        }

        // (my question response...:)...)
        // 2nd new object made
        Policy policyTwo = new Policy() {
            @Override
            public boolean processClaim(double claimAmount, String claimReason) {
                return false;
            }
        }; // this object is using a 'zero-argument' or 'default' constructor as there are no arguments passed though the constructor. You get this for free from Java if none of your own constructors have been made
        System.out.println(policyTwo.getPolicyHolder());// null is printed as nothing has been assigned to THIS policyHolder called on the 2nd new object
        System.out.println(policyTwo.getPremium()); // 0.0 is the default value as there isn't a value present

        // shows example of how the strings are set the same on different 'instances of the class' i.e. policyOne & policyTwo
        policyOne.setPolicyHolder("Denies Neagu");
        policyTwo.setPolicyHolder("Denies Neagu");
        // '==' asks are they the same object
        // .equals calls the .equals() method which returns a boolean
        if (policyOne.equals(policyTwo)) {
            System.out.println("The objects are the same");
        }

        // creating a constructor looses any free constructors form intellij
        // the order of the arguments written in this 'instance of the constructor' is determined by the order the parameters in the constructor within the Policy class
        Policy policyThree = new Policy(
                "Car",
                "Monica Taylor",
                12.0,
                1200.0,
                null) {
            @Override
            public boolean processClaim(double claimAmount, String claimReason) {
                return false;
            }
        }; // 3rd new object made
        System.out.println(policyThree);

        // instance of the subclass CarPolicy
        CarPolicy tanyaPolicy = new CarPolicy(
                "Car",
                "Tanya",
                123.0,
                234000.0,
                null,
                new Vehicle());
        tanyaPolicy.setMaxCover(45000.0);
        tanyaPolicy.setTheCar(new Vehicle());
        System.out.println(tanyaPolicy);

        // policyTwo.setTheCar(new Vehicle) // would not work on Policy objects, only on CarPolicy objects

        // declaring Policy class type whilst making an instance using the CarPolicy class
        // inheritance described an 'is a' relationship e.g.: a sports car 'is a' vehicle, an ArrayList 'is a' List etc.
        // if you can read out loud the 'is a' relationship AND it makes sense, then it's correct to use it as an inheritance relationship in Java
        // aka below: a CarPolicy 'is a' Policy, from the right-hand side to the left (read it that way :))
        Policy staceyPolicy = new CarPolicy(
                "Car",
                "Stacey",
                12.0,
                123.0,
                null,
                new Vehicle());
        System.out.println(staceyPolicy.getPolicyHolder());

        // staceyPolicy.setTheCar(new Vehicle()); // can't access the CarPolicy class
        // ((CarPolicy)staceyPolicy).setTheCar(new Vehicle()); // way to get around the above error (this is called casting) HOWEVER it does come with errors/issues so... don't bother :P

        // Wed Sep 22 15:05:17 BST 2021 - example output
        Date date = new Date();
        System.out.println(date);

        // array of Policy classes (maybe instances of these)
        ArrayList<Policy> thePolicies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                thePolicies.add(new LifePolicy(true));
            } else {
                thePolicies.add(new CarPolicy(
                        "Car",
                        "random",
                        Math.random()*1000.0,
                        Math.random()*10000.0,
                        new Date(),
                        new Vehicle()));
            }
        }

        // Policy p = new Policy(); // cannot create an instance of an abstract class

        // iterates through arrayList
        // compiler knows there will be a toString method
        // principle of abstract classes
        for (Policy p: thePolicies) {
            p.processClaim(123.0, "Some reason or other");
            System.out.println(p);
        }

        // arrayLists of Person and Phone classes
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Daniel", "White"));
        personList.add(new Person("Adam", "White"));
        personList.add(new Person("Zebedee", "White"));
        personList.add(new Person("Daniel", "Blue"));
        // Collections.sort(personList);
        System.out.println(personList);
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("00000000000"));
        phoneList.add(new Phone ("111111100000"));
        phoneList.add(new Phone ("22222200000"));
        phoneList.add(new Phone ("033333330000"));
        phoneList.add(new Phone( "044444444000"));
        for(Messageable m : phoneList) {
            m.sendMessage();
        }
        Messageable.anotherFunction();

        // CollectionTester using arrayLists:
        ArrayList<String> myList = new ArrayList<>(50);
        for (int i = 0; i < 40; i++) {
            myList.add(39 - i, "Hello" + i);
        }
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(13));
        myList.remove(13);
        System.out.println(myList);
        System.out.println(myList.get(13));
        myList.add(13, "New Value");
        System.out.println(myList);

        // Hashsets
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Clover");
        mySet.add("Sam");
        mySet.add("Alex");
        mySet.add("Arthur");
        mySet.add("Clover");
        System.out.println(mySet);

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Cathy", "French"));
        personSet.add(new Person("Danny", "Jew")); // depends on hashCode & equals
        personSet.add(new Person("Maxie", "Gunthorpe"));
        personSet.add(new Person("Sara", "Winsville"));
        System.out.println(personSet);


        // 24th September 2021: ////////////////////////////////////////////////////////////////////////////////////////

        // enum reviews (1)
        public enum DayOfWeek {
            MON, TUES, WEDNES,
            THURS, FRI, SAT, SUN
        }

        // enum reviews (2)
        DayOfWeek dayOfWeek;
        Scanner scan = new Scanner(System.in);
        dayOfWeek = DayOfWeek.valueOf(scan.next());
        System.out.println(dayOfWeek.equals(DayOfWeek.MON));
        // dayOfWeek = 1 + dayOfWeek;
        switch (dayOfWeek) {
            case SAT: case SUN:
                System.out.println("It's the weekend");
                break;
            case MON: case TUES: case WEDNES: case THURS: case FRI:
                System.out.println("It's the weekday");
                break;
            case FRI:
                System.out.println("Nearly the weekend!!!");
                break;
        }

        // abstraction review ///////////////////////////////////////
        // taking real world objects and have real world things affecting it using a java class
        // abstraction - can't work with the class, it takes making an instance aka the object in order for you to use it
        Person2 emp1 = new Employee();
        // using package access (commented out below) is not recommended by Neil so...
        // emp1.firstName = "Hello";
        //  emp1.setDepartment("Marketing"); // can no longer use these with Person2
        emp1.setFirstName("Ted");
        emp1.setLastName("Person");
        // emp1.setSalary(45000.0); // can no longer use these with Person2
        // emp1.setSalary(50000.0); // can no longer use these with Person2
        // emp1.print(); // can no longer use these with Person2
        Customer cust = new Customer();
        // cust.setFristName("Terry");
        // cust.print(); // wont work
        System.out.println(emp1);
        System.out.println(cust);


        // SOLID study/review
        // Collection <String> c = new ArrayDeque<>();
        // c.;
        // Queue <String> c = new ArrayDeque<>();
        // c.;


        // 27th September 2021: ////////////////////////////////////////////////////////////////////////////////////////

        (1. goes in main method)
        System.out.println("Would you prefer ArrayList, HashSet or ArrayDeque?");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        CollectionFactory theFactory;

        switch (choice) {
            case "ArrayList":   theFactory = new ArrayListCollectionFactory(); break;
            case "ArrayDeque":  theFactory = new ArrayDequeCollectionFactory(); break;
            case "HashSet":     theFactory = new HashSetCollectionFactory(); break;
            default:            theFactory = null; break;
        }

        Collection<Person2> person2Collection = theFactory.getImplementation();
        person2Collection.add(new Person2("Jamie", "Baxter"));
        person2Collection.add(new Person2("Shelly", "Gill"));
        System.out.println(person2Collection);

        (2. goes outside main method)
//    // more likely solution you'll see (but not needed anymore)
//    private static Collection<Person2> collectionFactory(String choice){
//        if(choice.equals("ArrayList")){
//            return new ArrayList<>();
//        } else if(choice.equals("HashSet")) {
//            return new HashSet<>();
//        } else if(choice.equals("ArrayDeque")){
//            return new ArrayDeque<>();
//        } else {
//            return null;
//        }
//    }

        // 28th September 2021: ////////////////////////////////////////////////////////////////////////////////////////

       // 1.
       MySingleton theInstance = MySingleton.getInstance();
       MySingleton anotherInstance = MySingleton.getInstance();

        System.out.println(theInstance);
        System.out.println(anotherInstance);


        // 2.
        ExceptionsWorker worker = new ExceptionsWorker();
        try{
            worker.myFunc();
        } catch(ParseException | MyException e) {
            e.printStackTrace();
        }


        // 30th September 2021: ////////////////////////////////////////////////////////////////////////////////////////
            private static class PersonSorter implements Comparator<Person>{
                @Override
                public int compare(Person o1, Person o2){
                    return o1.getName().compareTo(o2.getName());
                }
            }
        // 30th September
        int[] theArray = {123, 345, 234, 567, 34, 566, 7365, 235, 555};
        BinaryTree theTree = new BinaryTree();
        for (int nextValue : theArray) {
            theTree.add(nextValue);
        }
        System.out.println(theTree);
//        BinaryTree.TreeNode theNode = new BinaryTree.TreeNode(123);

        List<Person> personList = new ArrayList<>(List.of(
                new Person("Bob", "1"),
                new Person("Zed", "66"),
                new Person("Frank", "123"),
                new Person("Jane", "345")));
        // using anonymous inner class
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName()); // can change this to sort however u'd like
            }
        });
        System.out.println(personList);


        // 4th October 2021: ////////////////////////////////////////////////////////////////////////////////////////
        String line = null;
        try(BufferedReader in = new BufferedReader(new FileReader("canada.csv"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"))){
            while((line = in.readLine()) != null) {
                System.out.println(line);
                out.write(line + "\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        // 5th October 2021: ////////////////////////////////////////////////////////////////////////////////////////
        String line = null;
        // try-with-resources
        try(BufferedReader in = new BufferedReader(new FileReader("canada.csv"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"))){
            while((line = in.readLine()) != null) {
                System.out.println(line);
                out.write(line + "\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        Date date = Date.valueOf("2021-10-05");
        System.out.println(date);
//        Path myPath = Paths.get("..\\IOExample\\canada.csv");
//        Path myPath = Paths.get("canada.csv");
        Path myPath = Paths.get("C://");
        System.out.println(myPath);
        System.out.println(Files.isRegularFile(myPath));


        // 6th October 2021: ////////////////////////////////////////////////////////////////////////////////////////


 */
    }
}
