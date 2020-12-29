package com.company;

public class Vehicle {
    private int currentVel;
    private int currentDir;
    private String name;
    private String size;


    public Vehicle(String n, String s){
        name=n;
        size=s;
        currentDir=0;
        currentVel=0;
    }
    public void steer(int direction){
        currentDir+=direction;
        System.out.println("Steering at : " + currentDir);
    }
    public void move(int velocity, int direction){
        currentVel=velocity;
        currentDir=direction;
        System.out.println("Moving at : "+ currentDir + "at "+currentVel+ " speed." );
    }

    public int getCurrentVel() {
        return currentVel;
    }

    public int getCurrentDir() {
        return currentDir;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
