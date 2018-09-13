package com.company;

public class C extends A {

    private int z;
    C(){
        z= 30;
        System.out.println("Value of z in C is "+ z);
        System.out.println("Value of x in A is " + x);
        // System.out.println("Value of y in B is " + y);  gives error as B is not a parent of C class
    }
}
