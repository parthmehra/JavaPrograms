package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean flag=true;
        while (true) {

            System.out.println("Enter the Number: ");
            boolean IsAnInt = scanner.hasNextInt();


            if (IsAnInt) {
                int number = scanner.nextInt();
                if(flag) {
                    flag = false;
                    max = number;
                    min = number;
                }

                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } else
                break;


            scanner.nextLine();


        }
        System.out.println("Min= " + min + ", Max= " + max);
        scanner.close();
    }
}

