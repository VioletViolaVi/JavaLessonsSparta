package com.spartaglobal.java.lessons;

import java.util.Date;

// 'extends' used to inherit from Policy class
// can only have ONE superclass in Java. Cannot have multiple inheritances. Only SINGLE inheritance in Java
public class CarPolicy extends Policy {

    private Vehicle theCar;

    public CarPolicy(String type,
                     String policyHolder,
                     double premium,
                     double maxCover,
                     Date renewalDate,
                     Vehicle theCar) {
        super(type,
                policyHolder,
                premium,
                maxCover,
                renewalDate);
        this.theCar = theCar;
    }

    // generated using generate feature in intellij
    public Vehicle getTheCar() {
        return theCar;
    }

    // generated using generate feature in intellij
    public void setTheCar(Vehicle theCar) {
        this.theCar = theCar;
    }

    // generated using generate feature in intellij
    @Override
    public String toString() {
        return "CarPolicy{" +
                "theCar=" + theCar +
                '}' + super.toString();
    }
}
