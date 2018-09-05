package com.company;

public class Customer {

    private int billId;
    private int Qty;
    private String custName;
    private float price;


    void initalize(int x, String custName, int z, float t)
    {
        this.billId = x;
        this.Qty = z;
        this.custName = custName;
        this.price = t;


    }

    void display(){
        System.out.println("Customer Name " + custName);
        System.out.println("billId " + billId);
        System.out.println("Quantity " + Qty);
        System.out.println("Price " + price);

    }

    float billamount()
    {
        float k;
        k = Qty * price;

        return(k);
    }

}
