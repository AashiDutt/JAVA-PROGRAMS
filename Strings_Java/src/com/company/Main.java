package com.company;

public class Main {

    public static void main(String[] args){
        String str = new String("Engineering"); // creating an object

        String str1;  // memory not allocated: just points to NULL
        str1 = "Engineering";  // value stored at a memory address

        System.out.println("value of str  is " + str);
        System.out.println("value of str1 is " + str1);

        System.out.println("Comparing addresses of str and str1 =  "+ (str1 == str)); // comparing addresses of str and str1

        // comparing values of str and str1
        // USE .EQUALS

        System.out.println("Comparing values of str and str1 =  " + (str.equals(str1)));

        // if you want to ignore case sensitive tect while comparing
        // System.out.println(str.equalsIgnoreCase(str1));



        // printing one character at a time

        System.out.println("Printing value at a single index (5) = " + (str.charAt(5)));

        // printing more than one character at a time
        // USE getChars
        //char a[] = new char[10];
       // System.out.println(str.getChars(2,6,a[],0));


        //use substring for printing from given location to end or to other index
        System.out.println("printing chars from 5 to 8 index  = " + str.substring(5,9));


        // printing index of an alphabet
        // first ever occurance from beginning

        System.out.println("First occurance of 'e' was at index =  " + str.indexOf('e'));

        // for last occurance
        System.out.println("last occurance of 'e' was at index = " + str.lastIndexOf('e'));


        // for length of string
        System.out.println("Length of entire string is " + str.length());


    }
}
