package com.company;

public class C extends B {// child class

    // Private variable can be used only in same class not in any subclass
    private int z;
    C(){
        z = 30;
        System.out.println("x in C is  " + x);
        System.out.println("y in C is  " + y);
        System.out.println("z in C is  " + z);
    }
}
