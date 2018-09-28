// The composition deals with a has a relationship.
//Composition and Inheritance in Java is that Composition allows reuse of code without extending it but for
// Inheritance you must extend the class for any reuse of code or functionality.

package com.company;

public class Main {

    public static void main(String[] args) {
	  Dimensions dimensions = new Dimensions(20,20,5); // itializing and forming an object for class
        Case theCase = new Case("220B","Dell","240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",4,6 ,"v2.44");
        motherboard theMotherboard = new motherboard("BJ-200","ASUS",4,6,"v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        /*thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();*/



    }
}
