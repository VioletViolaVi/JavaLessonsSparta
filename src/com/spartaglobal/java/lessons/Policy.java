package com.spartaglobal.java.lessons;
import java.util.Date;

// class is a type of object
public class Policy {
    // represents state information aka properties: the data elements of the class
    String type;
    String policyHolder;
    double premium;
    double maxCover;
    Date renewalDate;

    // methods (functions inside a class)
    public boolean processClaim(double claimAmount, String claimReason){
        System.out.println("Processing claim for: " + claimReason);
        // the below WILL return a boolean value:
        return claimAmount < maxCover;
    }

}
