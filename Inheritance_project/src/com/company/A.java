package com.company;

public class A {

    // Parent Class
    // Protected means these variables can only be used in parent as well as child class but not any independent class

    protected int x;
    protected int y;

    // Creating Constructor of Parent class
    A()
    {
        System.out.println(" Default constructor of A");  // This will run every time child class object is formed
    }



}
