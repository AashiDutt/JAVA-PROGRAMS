package com.company;

public class Main {

    public static void main(String[] args) {
	    Rectangle r = new Rectangle(); // object to access rectangle method
	    r.setdimension(5,6);
	    Rectangle R1 = new Rectangle(); // creatig another object
        
        // using first object to call second object( Call by Object)
	    R1.area(r);

    }
}
