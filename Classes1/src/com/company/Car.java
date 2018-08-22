// CODE FOR CLASS CALLED Car

package com.company;

// Creating a new class
// On project window goto folder name --> src --> com.company --> right click --> new --> Java class --> set name as Car(for example)

public class Car {
    // public = unrestricted acess to the class
    // private = these variables cannot be accessed outside Car class

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // creating method (function)in class
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;

    }
}
