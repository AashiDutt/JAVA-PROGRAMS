package com.company;

public class Circle {
    private float r;
    void setRadius(float r){
        this.r = r;
    }

    void area(Circle C2){
        float a;
        a = 3.14f*C2.r*C2.r;
        System.out.println("Area of circle  is "+ a);
    }
}
