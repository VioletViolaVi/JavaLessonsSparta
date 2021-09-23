package com.spartaglobal.java.lessons;

public class Phone implements Messageable{
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage() {
        System.out.println("This is a printed message" + getPhoneNumber());
    }
}
