package com.company;

public class Main {

    public static void main(String[] args) {

        // A Static Method is called as ClassName.MethodName()
        // or methodName() if in the same Class

        Calculator.Sum(5,6); // if in different class
        Hello(); // if in same class

    }

    public static void Hello(){

        System.out.println("Hello World!!");
    }

}
