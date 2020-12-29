package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth=0;
        System.out.println("Enter your year of birth:");
        boolean hasNextInt=scanner.hasNextInt();
        if (hasNextInt) {
            yearOfBirth = scanner.nextInt();


        }
        else
            System.out.println("Invalid year");
        scanner.nextLine(); // handle next line character (enter key)
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}
