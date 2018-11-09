//Generics are a facility of generic programming that were added to the Java programming language in 2004 within version J2SE 5.0.
// They were designed to extend Java's type system to allow
// “a type or method to operate on objects of various types while providing compile-time type safety”

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList(); // create an ArrayList
        // adding numbers to the list
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        printDoubled(items);  // callig method for print

    }
    private static void printDoubled(ArrayList<Integer> n){
        for(Object i:n){ // i indicates indexes of the Arraylist
            System.out.println((Integer) i * 2);  // print numbers by multiplying with 2
        }
    }
}
