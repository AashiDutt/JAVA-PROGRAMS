package com.company;

public class A {   // Grand Father class

    protected int x;
    // Protected variable can be used in Subclasses only .
    A(){
        x = 10;
        System.out.println("Value of x in A is  " + x);
    }
}
