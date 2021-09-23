package com.spartaglobal.java.lessons;
import java.util.Date;
import java.util.Objects;

// classes are a type of object
// adding the keyword 'final' (i.e.: public final class Policy) prevents you from creating subclasses i.e. nothing else can inherit from it - it also means it's been placed at the bottom of the hierarchy
public abstract class Policy {
    // instance variables should normally be private because they represent a state of a class, and we want them to be hidden. It is needed in this class, but it is not needed in the main method where they are 'called'. So avoid making these public (public is not fine so avoid as much as possible)
    // private: can only be used in this class
    // represents state information aka properties: the data elements of the class
    private String type;
    private String policyHolder;
    private double premium;
    private double maxCover;
    private Date renewalDate;

    // name of constructor is ALWAYS the same as the name of the class otherwise it's not a constructor
    // no RETURN values, e.g. boolean, String, int, etc. are defined in the signature of the constructors
    // generated using generate feature in intellij:
    public Policy(String type, String policyHolder, double premium, double maxCover, Date renewalDate) {
        this.type = type;
        this.policyHolder = policyHolder;
        this.premium = premium;
        this.maxCover = maxCover;
        this.renewalDate = renewalDate;
    }

    // constructor with zero arguments
    public Policy() {
    }

    // generated using generate feature in intellij
    @Override
    public boolean equals(Object o) {
        Policy policy = (Policy) o;
        return policy.getPolicyHolder().equals(getPolicyHolder());
    }

    // generated using generate feature in intellij
    @Override
    public int hashCode() {
        return Objects.hash(type, policyHolder, premium, maxCover, renewalDate);
    }

    // methods (functions inside a class) should normally be public, but it's not crucial
    public abstract boolean processClaim(double claimAmount, String claimReason); // abstract method, these are only allowed in abstract methods in abstract classes

    // for these sorts of methods, their names should start with 'set' then capitalise the next word attached to it (camelCasing).
    public void setType(String newType){
        type = newType;
    }


    // same convention as above with the 'set' but for 'get'
    public String getPolicyHolder() {
        return policyHolder;
    }

    // generated using generate feature in intellij
    public String getType() {
        return type;
    }

    // generated using generate feature in intellij
    public void setPolicyHolder(String policyHolder) {
        // 'this' refers to the current object and is needed as the parameter in this method is the same name as the instance variables/fields above
        this.policyHolder = policyHolder;
    }

    // generated using generate feature in intellij
    public double getPremium() {
        return premium;
    }

    // generated using generate feature in intellij
    public void setPremium(double premium) {
        // allows us to do some validation
        if (premium < 0.0) {
            // report an error at this point - to do with exceptions
            this.premium = 0.0;
        } else {
            this.premium = premium;
        }
        this.premium = premium;
    }

    // generated using generate feature in intellij
    public void setMaxCover(double maxCover) {
        this.maxCover = maxCover;
    }

    // generated using generate feature in intellij
    public double getMaxCover() {
        return maxCover;
    }

    // generated using generate feature in intellij
    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    // generated using generate feature in intellij
    public Date getRenewalDate() {
        return renewalDate;
    }

    // generated using generate feature in intellij
    // @Override this is a feature called an annotation and tells how other parts of the program how it is to respond to it i.e. to prioritise it
    @Override
    // once present, this toString method will be called automatically whenever java sees you will need it in your code
    public String toString() {
        // can edit this string's default structure to make it look how you want
        return "Policy{" +
                "type='" + type + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", premium=" + premium +
                ", maxCover=" + maxCover +
                ", renewalDate=" + renewalDate +
                '}';
    }
}