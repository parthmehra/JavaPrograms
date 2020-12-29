package com.company;

public class Main {

    public static void main(String[] args) {
    Wall room= new Wall();
    Wall room2=new Wall(234, 11);
    room.setWidth(55);
        System.out.println(room.getWidth());
    System.out.println("Area of the room is "+ room2.getArea());

    }
}
