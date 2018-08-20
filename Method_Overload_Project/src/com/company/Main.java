// This is a code to implement Method Overloading to find
// sum of 2 numbers
// sum of 3 numbers
// sum of 4 numbers

package com.company;

public class Main {

    public static void main(String[] args) {

	   sum(50,100);
	   sum(20,30,50);
	   sum(100, 900,100,200);
    }

    public static int sum(int num1 , int num2){
        int result = num1 + num2;
        System.out.println(num1 + " + " +num2 + " = " + result);
        return 0;
    }

    public static int sum(int num1 , int num2,int num3){
        int result = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
        return 0;
    }

    public static int sum(int num1 , int num2,int num3, int num4){
        int result = num1 + num2 + num3 + num4;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + result);
        return 0;
    }
}
