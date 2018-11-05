package com.company;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    Boolean callPhone(int phoneNumber);
    Boolean isRinging();
}
