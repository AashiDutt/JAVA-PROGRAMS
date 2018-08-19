package com.company;


public class Main {

    public static void main(String[] args) {
         int kiloBytes = 2050;

        MegaBytesAndKiloBytes(kiloBytes);
    }


    public static void MegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingkiloBytes;
            int megabytes = kiloBytes % 1024;
            remainingkiloBytes = megabytes;

            System.out.println(kiloBytes + "KB = " + megabytes + "MB and " + remainingkiloBytes + "KB");

        }
    }
}