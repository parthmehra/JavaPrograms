package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The minimum value of the array is " + findMin(readIntegers(5)));
    }
    public static int[] readIntegers(int count){
        int[] array=new int[count];
        System.out.println("Enter the "+ count+ " elements of the array:\r");
        for(int i=0;i< array.length; i++){
            array[i]=scan.nextInt();
        }
        System.out.println("The entered array is ");
        for(int i=0;i< array.length; i++){
            System.out.println(array[i]);
        }

    return array;
    }
    public static int findMin(int[] array){
        int min=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }

        }
    return min;
    }

}
