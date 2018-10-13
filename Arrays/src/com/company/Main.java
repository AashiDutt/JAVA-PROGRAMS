package com.company;

import java.util.Scanner;   // import scanner class

public class Main {
 private static Scanner scanner = new Scanner(System.in); // take input from user
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);  // counter initalize to number of inputs

        for(int i=0;i<myIntegers.length;i++){
            System.out.println("Element " + i+", typed value was " + myIntegers[i]);
        }
	  //int[] myIntArray ={1,2,3,4,5,6,7,8,9};  // initializing the array
	  //myIntArray[0] = 1;
      //  for(int i=0; i<=8;i++)
       // System.out.println(myIntArray[i]);     // acessing elements in an array

    }

    public static int[] getIntegers(int number){  // method to store values
        System.out.println("Enter "+ number + "integer values. \r");
        int[] values = new int[number];

        for(int i=0;i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
