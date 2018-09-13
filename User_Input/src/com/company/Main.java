// Code to take input from user

package com.company;
import java.util.Scanner;     // importing Scanner Class
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);    // creating object of Scanner class
        System.out.println("Enter any name");

        String name;   // create a String variable
        name = in.nextLine();  // getting input from user

        System.out.println("Hello "+ name);
        

        int num;     // creating integer variable
        System.out.println("Enter age");
        num = in.nextInt();  // getting integer input from user
        System.out.println("age is " + num);

    }
}
