// This code helps to implement Basic code for 'Constructor Inheritance' using 'Protected ' Acess specifier

package com.company;

public class Main {  // Independent class
    // Protected variables cannnot be acessed here

    public static void main(String[] args) {

        B b = new B(50);    // creating object to use child class
        // try skipping passing parameter through B i.e delete x: 10 in above code

        b.show();         // calling show function



    }
}
