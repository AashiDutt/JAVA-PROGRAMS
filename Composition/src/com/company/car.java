package com.company;

public class car extends vehicle {

    private int doors;
    private int engineCapacity;

    public car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
