package com.company;

public class Shape {
    private int x, y, z;
    private float r;

    // Constructor Overloading
    Shape(int x, int y) {
        this.x = x;
        this.y = y;

    }

    Shape(int x) {
        this.x = x;
    }

    Shape(float r) {
        this.r = r;
        this.x=(int)r;

    }

    // Method Overloading
    void area(int x, int y) {
        //int z;
        this.x = x;
        this.y = y;
        // z = x* y;
        System.out.println("product is" + (x * y));

    }

    float area(float r) {
        this.r = r;
        System.out.println("circle are");
        return (3 * r * r);
    }

    int area() {
        z = x * x;
        return (z);

    }


}
