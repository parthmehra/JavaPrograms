package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fav number");
        try {
            int n = scan.nextInt();
            System.out.println("That's a good number");
        } catch (NullPointerException e) {
            System.out.println("You've entered a null value");
        }
    }
}
