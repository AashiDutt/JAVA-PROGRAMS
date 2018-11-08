// This code implements inner classes which mean nested classes or a class within another class
//java Inner Class or nested class is a class i.e. declared inside the class or interface. We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.
// Additionally, it can access all the members of outer class including private data members and methods.

package com.company;

public class Main {

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);  // object of class
	    mcLaren.addGear(1,5.3);
	    mcLaren.addGear(2,10.6);
	    mcLaren.addGear(3,15.9);
	    mcLaren.operateClutch(true);
	    mcLaren.changeGear(1);
	    mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));
    }
}
