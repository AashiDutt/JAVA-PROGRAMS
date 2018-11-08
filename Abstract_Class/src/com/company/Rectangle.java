package com.company;

  class Rectangle extends Shape {  // child class
     private int l,b;
     Rectangle(int l,int b){  // parameterized constructor
         this.l = l;
         this.b = b;
     }

     // defining functionality of abstract class
     public void area(){
         int a;
         a = l*b;
         System.out.println("Area = " + a);
     }
     public void perimeter(){
         int p;
         p = 2*(l+b);
         System.out.println("Perimeter = " +p);
     }
}
