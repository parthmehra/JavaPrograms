package com.company;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private String isManual;
    private int currentGear;

    public Car(String n, String s, int wheels, int doors, int gears, String isManual) {
        super(n, s);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

}
}
