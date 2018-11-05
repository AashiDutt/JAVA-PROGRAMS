package com.company;

public class Main {

    public static void main(String[] args) {
       ITelephone ashPhone;
       ashPhone = new DeskPhone(1234);
       ashPhone.powerOn();
       ashPhone.callPhone(1234);
       ashPhone.answer();
    }
}
