// This code is to imply basics of floating point numbers and double datatype numbers.

package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	  int var1 = 5 /2 ;
	  float var2 = 5f / 3f;  // float has 8 digits of precision
	  double var3 = 5d/ 3;  // double is the default datatype for floating numbers(double has 16 digits of precision )

        System.out.println("integer value = "+ var1);
        System.out.println("float value = " + var2);
        System.out.println("double value =  " + var3);


       // Converting Pounds to Killograms
        double pound = 200d;
        double kg ;
        kg = 0.45359237 * pound ;
        System.out.println("result = " + kg);

    }
}

/* Note
 Width of an Integer = 32 (4 bytes) 2^5
 Width of Float = 32 (4 bytes)
 Width of Double = 64 (8 bytes)

 */
