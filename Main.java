package com.company;

public class Main {

    public static void main(String[] args) {
	  int var1 = 214748364; // width of int = 32

	  byte var2 = -128; // takes 1 byte of space (width of byte = 8)
      // byte ranges from -128(min) to 127 (max)
      byte var2new = (byte)(var2/2);
      // byte is used so that an integer value is not stored in a byte which is not possible
      // width of integer no. is greater than that of a byte no.
        System.out.println("output = " + var2new);

      short var3 = -32768; // ranges b/w -32768 to 32767 (width of short =16)

      long var4 = 100L;  // width of long = 64) or 2^64 spaces




    }
}
