package com.company;

import java.sql.SQLOutput;

public class B extends A {  // Child class  extends to parent class

    void show(){     // creating a method to acess parent class variables

        // when function is called  values of x and y are set in the parent class
        x = 10;
        y = 20;

        int z = x+y;
        System.out.println(" x + y = " + z);
    }

    // Let' create a constructor in child class

    B()
    {
        System.out.println(" Default constructor of B");
    }

    // Creating Parameterized Constructor

    B(int x){
        System.out.println("This is a parameterized Constructor");
        System.out.println("Value of x is " + x);
    }
}
