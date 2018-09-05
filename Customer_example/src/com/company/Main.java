package com.company;

public class Main {

    public static void main(String[] args) {
	   Customer cust = new Customer();

	   cust.initalize(1001,"Aashi", 10,20.0f);
	   cust.display();

        float p;
        p = cust.billamount();
        System.out.println("Net amount is " + p);



    }
}
