package com.company;

public class Main {

    public static void main(String[] args) {
     // Printing a String
        String var1 = "Hello World";
        System.out.println("String is " + var1);

     // Printing String with a Unicode
        var1 = var1 + "\u00A9";
        System.out.printf("string becomes" + var1);

        String var2 = "250.984"; // takes numerics as data only and does not perform any operation(just prints the numerics)
        var2 = var2 + "990.235";
        System.out.println("string is " + var2);

        String var3 ="50";
        int new1 = 10;
        var3 = var3 + new1;
        System.out.println("Output = " + var3);  // converts integer into string

    }
}
