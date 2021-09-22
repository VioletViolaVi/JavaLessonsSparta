package com.spartaglobal.java.lessons;
import java.util.Date;

public class Policy {
    // represents state information aka properties: the data elements of the class
    String type;
    String policyHolder;
    double premium;
    double maxCover;
    Date renewalDate;

    // methods (functions inside a class)
    boolean processClaim(double claimAmount, String claimReason){
        System.out.println("Processing claim for: " + claimReason);
        // the below will return a boolean value:
        return claimAmount < maxCover;
    }

}
