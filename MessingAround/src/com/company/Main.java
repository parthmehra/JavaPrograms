package com.company;

public class Main {

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
        System.out.println(;
    }

}
class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");

    }
}