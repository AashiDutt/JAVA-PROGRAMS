package com.company;

public class new1 extends B {

    void new1(){
        // Super(20);  // calling  parent constructor explicitly
        System.out.println("Default constructor of B");

    }

    void new1(int y){
        // Super(y);
        System.out.println("Value of y in B " + y);
    }
}
