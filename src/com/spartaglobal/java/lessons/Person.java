package com.spartaglobal.java.lessons;

import java.io.Serializable;
import java.util.Objects;

// response to someone else's question
public class Person implements Comparable<Person>, Serializable, Messageable { // check vid for how to write this line - i think i fixed it!!!
    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        return firstName.length() == ((Person)o).firstName.length();
    }

    @Override
    public int hashCode() {
        return firstName.length();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // 23/09/2021 - check 2nd vid around 30mins in - i think i fixed it!!!
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.getLastName().equals(o.getFirstName())) {
            return this.getFirstName().compareTo(o.getFirstName());
        } else{
            return this.getLastName().compareTo(o.getLastName());
        }
    }

    @Override
    public void sendMessage() {
        System.out.println("Prints a message");
    }
}
