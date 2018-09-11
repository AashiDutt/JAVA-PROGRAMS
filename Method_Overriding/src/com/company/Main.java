// Method overriding is used when you use the same method  names with same parameters in two different classes.

package com.company;

public class Main {

    public static void main(String[] args) {
	  Dog rex = new Dog();
	  rex.Bark();

	  GermanShepherd GS = new GermanShepherd();
	  GS.Bark();


    }
}
