package com.company;

public class Rectangle {
     private int a,l,b;
     void area(Rectangle rect){
         a = rect.l * rect.b;
         System.out.println("area of rectangle is" + a);
     }
// method to set dimensions of rectangle to form a new rectangle
     void setdimension(int l,int b){
         this.l=l;
         this.b = b;

     }
}
