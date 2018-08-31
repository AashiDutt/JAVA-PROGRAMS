// Code to implement Constructor Overloading and Method Overloading

package com.company;

public class Main {

    public static void main(String[] args) {
      Shape circle = new Shape(3.5f);
      Shape square = new Shape(5);
      Shape rectangle = new Shape(5,6);

      float area;
      area = circle.area();  // since area is returning a value
        System.out.println("Area of circle is "+ area);

      rectangle.area(3,4);    // contains print statement so called directly

      int area1;
      area1 = square.area();  // since area is returning a value
        System.out.println("Area of Square is " + area1);
    }
}
