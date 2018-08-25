package com.company;

public class Main {
        // creating object to access classes
        // Instance Variable (shared by all objects(shared copies) and each object can assign their own values)
        public static void main(String[] args) {
            int y =10;
            Demo d1 = new Demo();  // creating object

            d1.x=20;

            Demo d2; // Reference Variable
            d2= new Demo();
            d2.x = 100;
            System.out.println(d2.x);
            System.out.println(d1.x);
            System.out.println(y);


        }


}
