// This code is used to print Day of week using Switch statement
// it takes input from user
package com.company;
import com.company.printDayofWeek;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int A;
        printDayofWeek d = new printDayofWeek();
        Scanner a = new Scanner(System.in);
        A = a.nextInt();
        d.day(A);

    }
}
