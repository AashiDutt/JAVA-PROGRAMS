package com.company;

public class Test extends Demo{
    int x = 90; // Instance Variable

    void Show(){
        int x = 50;  // Local Variable
        System.out.println("Local Variable x = " + x);
        System.out.println("Instance variable x = " + this.x);
        System.out.println("Protected Parent Instance variable x = " + super.x);
    }
}
