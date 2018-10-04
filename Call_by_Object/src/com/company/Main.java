// This code is used to implement call by object (parameter passing technique)
package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle C = new Circle(); // creating object
	    C.setRadius(3.5f);       // call by value
	    Circle C1= new Circle();
	    C1.area(C);              // call by 'C ' Object refrence
	    Circle C3;
	    C3= C1;                  // two objects pointing to same memory locations
    }
}
